package leo.bacherlorsthesis.agoratokenserver.domain.agora;

public interface PackableEx extends Packable {
    void unmarshal(ByteBuf in);
}
