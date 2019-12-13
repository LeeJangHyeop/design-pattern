package patterns.structural.state;

import patterns.structural.state.states.Complete;
import patterns.structural.state.states.Reject;
import patterns.structural.state.states.State;
import patterns.structural.state.states.Waiting;

import java.util.Random;

public class CreativeReview {

    private int id;

    private ReviewState reviewState;

    CreativeReview() {
        this.id = new Random().nextInt(100);
        this.reviewState = ReviewState.WAITING;
    }

    CreativeReview(ReviewState reviewState) {
        this.id = new Random().nextInt(100);
        this.reviewState = reviewState;
    }

    int getId() {
        return id;
    }

    ReviewState getReviewState() {
        return reviewState;
    }

    public void setReviewState(ReviewState reviewState) {
        this.reviewState = reviewState;
    }

    State getState() {
        switch (reviewState) {
            case COMPLETE:
                return new Complete(this);
            case REJECT:
                return new Reject(this);
            case WAITING:
                return new Waiting(this);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
