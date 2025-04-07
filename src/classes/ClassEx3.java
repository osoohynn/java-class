package classes;

public class ClassEx3 {
    private String title;
    private String review;

    public ClassEx3(String title, String review) {
        this.title = title;
        this.review = review;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getReview() {
        return review;
    }
    public void setReview(String review) {
        this.review = review;
    }

    public void show() {
        System.out.println("영화제목: " + this.title + ", 리뷰: " + this.review);
    }
}
