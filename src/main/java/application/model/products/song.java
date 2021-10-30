package application.model.products;

public class song {
    private String title;
    private String path;
    private String image;

    public song(String _title, String _path, String _image){
        title = _title;
        path = _path;
        image = _image;
    }
    @Override
    public song clone() {
        return new song(title, path, image);
    }
}
