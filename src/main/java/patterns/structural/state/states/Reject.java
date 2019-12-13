package patterns.structural.state.states;

import patterns.structural.state.CreativeReview;
import patterns.structural.state.ReviewState;

public class Reject implements State {

    private CreativeReview creativeReview;

    public Reject(CreativeReview creativeReview) {
        this.creativeReview = creativeReview;
    }

    @Override
    public void approve() {
        System.out.println("[Reject] approve");
        creativeReview.setReviewState(ReviewState.COMPLETE);
    }

    @Override
    public void reject() {
        System.out.println("[Reject] reject");
        throw new UnsupportedOperationException("already reject");
    }
}
