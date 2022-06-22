public class PosterManager {
    private int resultLength = 10;
    private DataMovie[] movies = new DataMovie[0];

    public PosterManager() {
    }

    public PosterManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public void add(DataMovie movie) {
        int length = movies.length + 1;
        DataMovie[] tmp = new DataMovie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public DataMovie[] findAll() {
        return movies;
    }

    public DataMovie[] findLast() {
        if (resultLength > movies.length) {
            resultLength = movies.length;
        }
        DataMovie[] result = new DataMovie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}

