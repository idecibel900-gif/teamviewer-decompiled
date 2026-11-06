package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class MarkerData {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public MarkerData() {
        this(ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.new_MarkerData(), true);
    }

    public static long getCPtr(MarkerData markerData) {
        if (markerData == null) {
            return 0L;
        }
        return markerData.swigCPtr;
    }

    public static long swigRelease(MarkerData markerData) {
        if (markerData != null) {
            if (markerData.swigCMemOwn) {
                long j = markerData.swigCPtr;
                markerData.swigCMemOwn = false;
                markerData.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.delete_MarkerData(j);
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

    public ParticipantColor getColor() {
        return ParticipantColor.swigToEnum(ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.MarkerData_color_get(this.swigCPtr, this));
    }

    public long getColorARGB() {
        return ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.MarkerData_colorARGB_get(this.swigCPtr, this);
    }

    public long getDigit() {
        return ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.MarkerData_digit_get(this.swigCPtr, this);
    }

    public boolean getHasColorARGB() {
        return ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.MarkerData_hasColorARGB_get(this.swigCPtr, this);
    }

    public boolean getHasNumber() {
        return ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.MarkerData_hasNumber_get(this.swigCPtr, this);
    }

    public boolean getMarkerAlive() {
        return ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.MarkerData_markerAlive_get(this.swigCPtr, this);
    }

    public String getText() {
        return ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.MarkerData_text_get(this.swigCPtr, this);
    }

    public void setColor(ParticipantColor participantColor) {
        ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.MarkerData_color_set(this.swigCPtr, this, participantColor.swigValue());
    }

    public void setColorARGB(long j) {
        ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.MarkerData_colorARGB_set(this.swigCPtr, this, j);
    }

    public void setDigit(long j) {
        ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.MarkerData_digit_set(this.swigCPtr, this, j);
    }

    public void setHasColorARGB(boolean z) {
        ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.MarkerData_hasColorARGB_set(this.swigCPtr, this, z);
    }

    public void setHasNumber(boolean z) {
        ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.MarkerData_hasNumber_set(this.swigCPtr, this, z);
    }

    public void setMarkerAlive(boolean z) {
        ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.MarkerData_markerAlive_set(this.swigCPtr, this, z);
    }

    public void setText(String str) {
        ISelectedMarkerDataUpdateSignalCallbackSWIGJNI.MarkerData_text_set(this.swigCPtr, this, str);
    }

    public MarkerData(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
