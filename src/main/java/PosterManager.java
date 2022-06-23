public class PosterManager {
    private DataMovie[] movies = new DataMovie[0];

    private int limit;

    public PosterManager() {
        limit = 10;
    }

    public PosterManager(int resultLength) {

        this.limit = resultLength;
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
        DataMovie[] result;
        if (limit < movies.length) {
            result = new DataMovie[limit];
        } else {
            result = new DataMovie[movies.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}

