import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class DataMovie {
    private int movieId; // номер фильма
    private String movieName; // название фильма
    private String movieGenre; // жанр фильма
}
