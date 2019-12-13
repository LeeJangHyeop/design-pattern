package patterns.structural.state;

public class StateMain {
    public static void main(String[] args) {
        // WAITING -> COMPLETE
        CreativeReview creativeReview = new CreativeReview();
        System.out.println("id: " + creativeReview.getId() + ", before state: " + creativeReview.getReviewState());
        creativeReview.getState().approve();
        System.out.println("id: " + creativeReview.getId() + ", after state: " + creativeReview.getReviewState());

        System.out.println();

        // WAITING -> REJECT
        creativeReview = new CreativeReview();
        System.out.println("id: " + creativeReview.getId() + ", before state: " + creativeReview.getReviewState());
        creativeReview.getState().reject();
        System.out.println("id: " + creativeReview.getId() + ", after state: " + creativeReview.getReviewState());

        System.out.println();

        // COMPLETE -> REJECT
        creativeReview = new CreativeReview(ReviewState.COMPLETE);
        System.out.println("id: " + creativeReview.getId() + ", before state: " + creativeReview.getReviewState());
        creativeReview.getState().reject();
        System.out.println("id: " + creativeReview.getId() + ", after state: " + creativeReview.getReviewState());

        System.out.println();

        // REJECT -> COMPLETE
        creativeReview = new CreativeReview(ReviewState.REJECT);
        System.out.println("id: " + creativeReview.getId() + ", before state: " + creativeReview.getReviewState());
        creativeReview.getState().approve();
        System.out.println("id: " + creativeReview.getId() + ", after state: " + creativeReview.getReviewState());
    }
}
