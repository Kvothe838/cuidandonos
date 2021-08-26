package converters;

import entities.ReaccionIncidente;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ReaccionIncidenteAttributeConverter implements AttributeConverter<ReaccionIncidente, String> {
    @Override
    public String convertToDatabaseColumn(ReaccionIncidente reaccionIncidente) {
        return null;
    }

    @Override
    public ReaccionIncidente convertToEntityAttribute(String s) {
        return null;
    }
}
