package patterns.structural.state.states;

import patterns.structural.state.CreativeReview;
import patterns.structural.state.ReviewState;

public class Waiting implements State {

    private CreativeReview creativeReview;

    public Waiting(CreativeReview creativeReview) {
        this.creativeReview = creativeReview;
    }

    @Override
    public void approve() {
        System.out.println("[Waiting] approve");
        creativeReview.setReviewState(ReviewState.COMPLETE);
    }

    @Override
    public void reject() {
        System.out.println("[Waiting] reject");
        creativeReview.setReviewState(ReviewState.REJECT);
    }
}
