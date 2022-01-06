package multrithrad.data;

import lombok.Data;
import java.util.UUID;

@Data
public class DataHolder {
    private final UUID uuid = UUID.randomUUID();
    private final byte[] data;
}
