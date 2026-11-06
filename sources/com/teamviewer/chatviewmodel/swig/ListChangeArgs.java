package com.teamviewer.chatviewmodel.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public class ListChangeArgs {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ListChangeArgs(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(ListChangeArgs listChangeArgs) {
        if (listChangeArgs == null) {
            return 0L;
        }
        return listChangeArgs.swigCPtr;
    }

    public static long swigRelease(ListChangeArgs listChangeArgs) {
        if (listChangeArgs != null) {
            if (listChangeArgs.swigCMemOwn) {
                long j = listChangeArgs.swigCPtr;
                listChangeArgs.swigCMemOwn = false;
                listChangeArgs.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public ListChangeType GetListChangeType() {
        return ListChangeType.swigToEnum(ListChangeArgsSWIGJNI.ListChangeArgs_GetListChangeType(this.swigCPtr, this));
    }

    public SizeTVector GetNewPositions() {
        return new SizeTVector(ListChangeArgsSWIGJNI.ListChangeArgs_GetNewPositions(this.swigCPtr, this), true);
    }

    public SizeTVector GetOldPositions() {
        return new SizeTVector(ListChangeArgsSWIGJNI.ListChangeArgs_GetOldPositions(this.swigCPtr, this), true);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ListChangeArgsSWIGJNI.delete_ListChangeArgs(j);
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

    public enum ListChangeType {
        Added(0),
        Removed,
        Moved,
        Replace,
        Reset;

        private final int swigValue;

        public static class SwigNext {
            private static int next;

            private SwigNext() {
            }
        }

        ListChangeType() {
            int i = SwigNext.next;
            SwigNext.next = i + 1;
            this.swigValue = i;
        }

        public static ListChangeType swigToEnum(int i) {
            ListChangeType[] listChangeTypeArr = (ListChangeType[]) ListChangeType.class.getEnumConstants();
            if (i < listChangeTypeArr.length && i >= 0) {
                ListChangeType listChangeType = listChangeTypeArr[i];
                if (listChangeType.swigValue == i) {
                    return listChangeType;
                }
            }
            for (ListChangeType listChangeType2 : listChangeTypeArr) {
                if (listChangeType2.swigValue == i) {
                    return listChangeType2;
                }
            }
            hk0.g(ua5.k(i, ListChangeType.class, "No enum ", " with value "));
            return null;
        }

        public final int swigValue() {
            return this.swigValue;
        }

        ListChangeType(int i) {
            this.swigValue = i;
            SwigNext.next = i + 1;
        }

        ListChangeType(ListChangeType listChangeType) {
            int i = listChangeType.swigValue;
            this.swigValue = i;
            SwigNext.next = i + 1;
        }
    }
}
