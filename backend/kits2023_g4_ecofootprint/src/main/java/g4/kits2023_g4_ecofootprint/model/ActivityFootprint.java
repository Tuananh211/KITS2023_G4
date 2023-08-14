package g4.kits2023_g4_ecofootprint.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "activityfootprint")
public class ActivityFootprint {
    @EmbeddedId
    public ActivityFootPrintId id;
    private int volumn;

    @Embeddable
    public class ActivityFootPrintId implements Serializable {
        private int activityId;
        private int footprintId;
    }
}
