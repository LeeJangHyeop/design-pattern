package patterns.structural.state.states;

import patterns.structural.state.CreativeReview;
import patterns.structural.state.ReviewState;

public class Complete implements State {

    private CreativeReview creativeReview;

    public Complete(CreativeReview creativeReview) {
        this.creativeReview = creativeReview;
    }

    @Override
    public void approve() {
        System.out.println("[Complete] approve");
        throw new UnsupportedOperationException("already complete");
    }

    @Override
    public void reject() {
        System.out.println("[Complete] reject");
        creativeReview.setReviewState(ReviewState.REJECT);
    }
}
