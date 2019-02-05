import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class MessageKindConverter implements AttributeConverter <MessageKind, String> {


    @Override
    public String convertToDatabaseColumn(MessageKind attribute) {
        if (attribute == null){
            throw new IllegalArgumentException("MessageKind = null");
        }
        return attribute.getValue();
    }

    @Override
    public MessageKind convertToEntityAttribute(String dbData) {
        for (MessageKind kind : MessageKind.values()){
            if (kind.getValue().equals(dbData)) return kind;
        }
        throw new IllegalArgumentException("Unable to map value " + dbData + "to MessageKind");
    }
}
