package com.teamviewer.commonresourcelib.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public class IRatingViewModel {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IRatingViewModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IRatingViewModel iRatingViewModel) {
        if (iRatingViewModel == null) {
            return 0L;
        }
        return iRatingViewModel.swigCPtr;
    }

    public void ReportActionEvent(RatingActionEventType ratingActionEventType, String str) {
        IRatingViewModelSWIGJNI.IRatingViewModel_ReportActionEvent(this.swigCPtr, this, ratingActionEventType.swigValue(), str);
    }

    public void ReportActionEventRating(int i) {
        IRatingViewModelSWIGJNI.IRatingViewModel_ReportActionEventRating(this.swigCPtr, this, i);
    }

    public void ReportScreenEvent(RatingScreenEventType ratingScreenEventType) {
        IRatingViewModelSWIGJNI.IRatingViewModel_ReportScreenEvent(this.swigCPtr, this, ratingScreenEventType.swigValue());
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IRatingViewModelSWIGJNI.delete_IRatingViewModel(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public enum RatingActionEventType {
        SendOnlyRating(0),
        FeedbackSubmitted(1),
        FeedbackRated(2);

        private final int swigValue;

        public static class SwigNext {
            private static int next;

            private SwigNext() {
            }
        }

        RatingActionEventType() {
            int i = SwigNext.next;
            SwigNext.next = i + 1;
            this.swigValue = i;
        }

        public static RatingActionEventType swigToEnum(int i) {
            RatingActionEventType[] ratingActionEventTypeArr = (RatingActionEventType[]) RatingActionEventType.class.getEnumConstants();
            if (i < ratingActionEventTypeArr.length && i >= 0) {
                RatingActionEventType ratingActionEventType = ratingActionEventTypeArr[i];
                if (ratingActionEventType.swigValue == i) {
                    return ratingActionEventType;
                }
            }
            for (RatingActionEventType ratingActionEventType2 : ratingActionEventTypeArr) {
                if (ratingActionEventType2.swigValue == i) {
                    return ratingActionEventType2;
                }
            }
            hk0.g(ua5.k(i, RatingActionEventType.class, "No enum ", " with value "));
            return null;
        }

        public final int swigValue() {
            return this.swigValue;
        }

        RatingActionEventType(int i) {
            this.swigValue = i;
            SwigNext.next = i + 1;
        }

        RatingActionEventType(RatingActionEventType ratingActionEventType) {
            int i = ratingActionEventType.swigValue;
            this.swigValue = i;
            SwigNext.next = i + 1;
        }
    }

    public enum RatingScreenEventType {
        FeedbackDialog(0),
        RatingFeedbackDialog(1),
        RatingDialog(2);

        private final int swigValue;

        public static class SwigNext {
            private static int next;

            private SwigNext() {
            }
        }

        RatingScreenEventType() {
            int i = SwigNext.next;
            SwigNext.next = i + 1;
            this.swigValue = i;
        }

        public static RatingScreenEventType swigToEnum(int i) {
            RatingScreenEventType[] ratingScreenEventTypeArr = (RatingScreenEventType[]) RatingScreenEventType.class.getEnumConstants();
            if (i < ratingScreenEventTypeArr.length && i >= 0) {
                RatingScreenEventType ratingScreenEventType = ratingScreenEventTypeArr[i];
                if (ratingScreenEventType.swigValue == i) {
                    return ratingScreenEventType;
                }
            }
            for (RatingScreenEventType ratingScreenEventType2 : ratingScreenEventTypeArr) {
                if (ratingScreenEventType2.swigValue == i) {
                    return ratingScreenEventType2;
                }
            }
            hk0.g(ua5.k(i, RatingScreenEventType.class, "No enum ", " with value "));
            return null;
        }

        public final int swigValue() {
            return this.swigValue;
        }

        RatingScreenEventType(int i) {
            this.swigValue = i;
            SwigNext.next = i + 1;
        }

        RatingScreenEventType(RatingScreenEventType ratingScreenEventType) {
            int i = ratingScreenEventType.swigValue;
            this.swigValue = i;
            SwigNext.next = i + 1;
        }
    }
}
