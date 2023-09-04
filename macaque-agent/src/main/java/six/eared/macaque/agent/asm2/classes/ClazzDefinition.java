package six.eared.macaque.agent.asm2.classes;

public class ClazzDefinition {

    private String className;

    private byte[] classData;

    public ClazzDefinition() {

    }

    public ClazzDefinition(String className, byte[] classData) {
        this.className = className;
        this.classData = classData;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public byte[] getClassData() {
        return classData;
    }

    public void setClassData(byte[] classData) {
        this.classData = classData;
    }
}
