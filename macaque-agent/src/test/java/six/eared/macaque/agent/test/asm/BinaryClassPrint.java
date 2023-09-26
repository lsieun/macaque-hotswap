package six.eared.macaque.agent.test.asm;


import six.eared.macaque.agent.asm2.AsmUtil;
import six.eared.macaque.asm.*;

import static six.eared.macaque.asm.Opcodes.ASM4;

/**
 * 反编译
 */
public class BinaryClassPrint extends ClassVisitor {

    private MethodVisitor methodVisitor;

    public BinaryClassPrint() {
        super(ASM4);
    }

    public BinaryClassPrint(MethodVisitor methodVisitor) {
        this();
        this.methodVisitor = methodVisitor;
    }

    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        System.out.println(name + " extends " + superName + " {");
    }

    public void visitSource(String source, String debug) {
    }

    public void visitOuterClass(String owner, String name, String desc) {
    }

    public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
        return null;
    }

    public void visitAttribute(Attribute attr) {
    }

    public void visitInnerClass(String name, String outerName, String innerName, int access) {
    }

    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
        System.out.println("    " + AsmUtil.accessToDescriptor(access) + desc + " " + name);
        return new AsmFieldPrinter();
    }

    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        System.out.println("    " + name + desc);
        return methodVisitor;
    }

    public void visitEnd() {
        System.out.println("}");
    }
}
