package six.eared.macaque.http.decode;

import reactor.netty.http.server.HttpServerRequest;

public class FormCodec<Req, Res> extends BaseCodec<Req, Res> {
    @Override
    public Req decode(HttpServerRequest request) {
        return null;
    }

    @Override
    public Res encode(Object obj) {
        return null;
    }
}
