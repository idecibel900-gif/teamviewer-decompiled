package com.teamviewer.fcm.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class NotificationTypes extends AbstractList<NotificationType> implements RandomAccess {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public NotificationTypes(Iterable<NotificationType> iterable) {
        this();
        Iterator<NotificationType> it = iterable.iterator();
        while (it.hasNext()) {
            doAdd(it.next());
        }
    }

    private void doAdd(NotificationType notificationType) {
        PushNotificationRegistrationSWIGJNI.NotificationTypes_doAdd__SWIG_0(this.swigCPtr, this, notificationType.swigValue());
    }

    private int doCapacity() {
        return PushNotificationRegistrationSWIGJNI.NotificationTypes_doCapacity(this.swigCPtr, this);
    }

    private NotificationType doGet(int i) {
        return NotificationType.swigToEnum(PushNotificationRegistrationSWIGJNI.NotificationTypes_doGet(this.swigCPtr, this, i));
    }

    private NotificationType doRemove(int i) {
        return NotificationType.swigToEnum(PushNotificationRegistrationSWIGJNI.NotificationTypes_doRemove(this.swigCPtr, this, i));
    }

    private void doRemoveRange(int i, int i2) {
        PushNotificationRegistrationSWIGJNI.NotificationTypes_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private void doReserve(int i) {
        PushNotificationRegistrationSWIGJNI.NotificationTypes_doReserve(this.swigCPtr, this, i);
    }

    private NotificationType doSet(int i, NotificationType notificationType) {
        return NotificationType.swigToEnum(PushNotificationRegistrationSWIGJNI.NotificationTypes_doSet(this.swigCPtr, this, i, notificationType.swigValue()));
    }

    private int doSize() {
        return PushNotificationRegistrationSWIGJNI.NotificationTypes_doSize(this.swigCPtr, this);
    }

    public static long getCPtr(NotificationTypes notificationTypes) {
        if (notificationTypes == null) {
            return 0L;
        }
        return notificationTypes.swigCPtr;
    }

    public static long swigRelease(NotificationTypes notificationTypes) {
        if (notificationTypes != null) {
            if (notificationTypes.swigCMemOwn) {
                long j = notificationTypes.swigCPtr;
                notificationTypes.swigCMemOwn = false;
                notificationTypes.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(NotificationType notificationType) {
        ((AbstractList) this).modCount++;
        doAdd(notificationType);
        return true;
    }

    public int capacity() {
        return doCapacity();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        PushNotificationRegistrationSWIGJNI.NotificationTypes_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    PushNotificationRegistrationSWIGJNI.delete_NotificationTypes(j);
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return PushNotificationRegistrationSWIGJNI.NotificationTypes_isEmpty(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public NotificationType remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public void reserve(int i) {
        doReserve(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    @Override // java.util.AbstractList, java.util.List
    public NotificationType get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public NotificationType set(int i, NotificationType notificationType) {
        return doSet(i, notificationType);
    }

    private void doAdd(int i, NotificationType notificationType) {
        PushNotificationRegistrationSWIGJNI.NotificationTypes_doAdd__SWIG_1(this.swigCPtr, this, i, notificationType.swigValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, NotificationType notificationType) {
        ((AbstractList) this).modCount++;
        doAdd(i, notificationType);
    }

    public NotificationTypes(NotificationType[] notificationTypeArr) {
        this();
        doReserve(notificationTypeArr.length);
        for (NotificationType notificationType : notificationTypeArr) {
            doAdd(notificationType);
        }
    }

    public NotificationTypes(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public NotificationTypes() {
        this(PushNotificationRegistrationSWIGJNI.new_NotificationTypes__SWIG_0(), true);
    }

    public NotificationTypes(NotificationTypes notificationTypes) {
        this(PushNotificationRegistrationSWIGJNI.new_NotificationTypes__SWIG_1(getCPtr(notificationTypes), notificationTypes), true);
    }

    public NotificationTypes(int i, NotificationType notificationType) {
        this(PushNotificationRegistrationSWIGJNI.new_NotificationTypes__SWIG_2(i, notificationType.swigValue()), true);
    }
}
