package leo.bacherlorsthesis.agoratokenserver.domain.agora;

public interface Packable {
    ByteBuf marshal(ByteBuf out);
}
