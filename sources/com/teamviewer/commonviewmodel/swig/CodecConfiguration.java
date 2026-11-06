package com.teamviewer.commonviewmodel.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class CodecConfiguration {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CodecConfiguration() {
        this(CodecConfigurationSWIGJNI.new_CodecConfiguration(), true);
    }

    public static long getCPtr(CodecConfiguration codecConfiguration) {
        if (codecConfiguration == null) {
            return 0L;
        }
        return codecConfiguration.swigCPtr;
    }

    public static long swigRelease(CodecConfiguration codecConfiguration) {
        if (codecConfiguration != null) {
            if (codecConfiguration.swigCMemOwn) {
                long j = codecConfiguration.swigCPtr;
                codecConfiguration.swigCMemOwn = false;
                codecConfiguration.delete();
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
                    CodecConfigurationSWIGJNI.delete_CodecConfiguration(j);
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

    public String getCodecName() {
        return CodecConfigurationSWIGJNI.CodecConfiguration_codecName_get(this.swigCPtr, this);
    }

    public int getColorFormat() {
        return CodecConfigurationSWIGJNI.CodecConfiguration_colorFormat_get(this.swigCPtr, this);
    }

    public boolean getHardwareAccelerated() {
        return CodecConfigurationSWIGJNI.CodecConfiguration_hardwareAccelerated_get(this.swigCPtr, this);
    }

    public long getHeightAlignment() {
        return CodecConfigurationSWIGJNI.CodecConfiguration_heightAlignment_get(this.swigCPtr, this);
    }

    public boolean getIsLowLatencySupported() {
        return CodecConfigurationSWIGJNI.CodecConfiguration_isLowLatencySupported_get(this.swigCPtr, this);
    }

    public int getLevel() {
        return CodecConfigurationSWIGJNI.CodecConfiguration_level_get(this.swigCPtr, this);
    }

    public String getMimeType() {
        return CodecConfigurationSWIGJNI.CodecConfiguration_mimeType_get(this.swigCPtr, this);
    }

    public long getMinHeight() {
        return CodecConfigurationSWIGJNI.CodecConfiguration_minHeight_get(this.swigCPtr, this);
    }

    public long getMinWidth() {
        return CodecConfigurationSWIGJNI.CodecConfiguration_minWidth_get(this.swigCPtr, this);
    }

    public int getProfile() {
        return CodecConfigurationSWIGJNI.CodecConfiguration_profile_get(this.swigCPtr, this);
    }

    public long getWidthAlignment() {
        return CodecConfigurationSWIGJNI.CodecConfiguration_widthAlignment_get(this.swigCPtr, this);
    }

    public void setCodecName(String str) {
        CodecConfigurationSWIGJNI.CodecConfiguration_codecName_set(this.swigCPtr, this, str);
    }

    public void setColorFormat(int i) {
        CodecConfigurationSWIGJNI.CodecConfiguration_colorFormat_set(this.swigCPtr, this, i);
    }

    public void setHardwareAccelerated(boolean z) {
        CodecConfigurationSWIGJNI.CodecConfiguration_hardwareAccelerated_set(this.swigCPtr, this, z);
    }

    public void setHeightAlignment(long j) {
        CodecConfigurationSWIGJNI.CodecConfiguration_heightAlignment_set(this.swigCPtr, this, j);
    }

    public void setIsLowLatencySupported(boolean z) {
        CodecConfigurationSWIGJNI.CodecConfiguration_isLowLatencySupported_set(this.swigCPtr, this, z);
    }

    public void setLevel(int i) {
        CodecConfigurationSWIGJNI.CodecConfiguration_level_set(this.swigCPtr, this, i);
    }

    public void setMimeType(String str) {
        CodecConfigurationSWIGJNI.CodecConfiguration_mimeType_set(this.swigCPtr, this, str);
    }

    public void setMinHeight(long j) {
        CodecConfigurationSWIGJNI.CodecConfiguration_minHeight_set(this.swigCPtr, this, j);
    }

    public void setMinWidth(long j) {
        CodecConfigurationSWIGJNI.CodecConfiguration_minWidth_set(this.swigCPtr, this, j);
    }

    public void setProfile(int i) {
        CodecConfigurationSWIGJNI.CodecConfiguration_profile_set(this.swigCPtr, this, i);
    }

    public void setWidthAlignment(long j) {
        CodecConfigurationSWIGJNI.CodecConfiguration_widthAlignment_set(this.swigCPtr, this, j);
    }

    public CodecConfiguration(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
