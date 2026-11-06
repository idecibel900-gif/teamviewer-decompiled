package com.teamviewer.multimedialegacylib.audio;

import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import kotlin.Metadata;
import o.a2;
import o.ak7;
import o.bk7;
import o.ec3;
import o.fx3;
import o.kj7;
import o.ny;
import o.pg5;
import o.ty;
import o.wy;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001:\u0002::J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\u0013\u0010\fJ\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\u0019\u0010\u0016J(\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u001c\u0010\u001dJh\u0010&\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\rH\u0086 ¢\u0006\u0004\b&\u0010'J@\u0010(\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH\u0086 ¢\u0006\u0004\b(\u0010)J(\u0010*\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0086 ¢\u0006\u0004\b*\u0010\u001dJ \u0010-\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001aH\u0086 ¢\u0006\u0004\b-\u0010.J \u0010/\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001aH\u0086 ¢\u0006\u0004\b/\u0010.J\u0018\u00100\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0086 ¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0086 ¢\u0006\u0004\b2\u00101J\u0018\u00103\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0086 ¢\u0006\u0004\b3\u00101J\"\u00104\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086 ¢\u0006\u0004\b4\u00105J \u00107\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u001aH\u0086 ¢\u0006\u0004\b7\u0010.J \u00108\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/teamviewer/multimedialegacylib/audio/NativeAudioInterface;", "", "", "data", "Lo/f88;", "callbackHandleRecordedData", "([B)V", "", "enable", "callbackHandleEnableNoiseGate", "(Z)V", "initAudioVOIP", "()Z", "", "samplesPerSecond", "bitsPerSample", "channels", "initAudioRemoteSound", "(III)Z", "shutdownAudio", "play", "playAudio", "(Z)Z", "playRemoteAudio", "record", "recordAudio", "", "id", "createAudioSourcePCM", "(JII)Z", "framesPerPacket", "framesSize", "bitrate", "quality", "complexity", "variableBitrate", "voiceActivityDetection", "discontinuousTransmission", "createAudioSourceSpeex", "(JIIIIIIIIII)Z", "createAudioSourceOpus", "(JIIIII)Z", "createAudioSourceMixed", "mixedID", "sourceID", "addAudioSourceToMixedSource", "(JJ)Z", "removeAudioSourceFromMixedSource", "setAudioSourceVOIP", "(J)Z", "setAudioSourceRemoteSound", "destroyAudioSource", "updateAudioSourceVOIP", "(J[B)Z", "addr", "updateAudioSourceRemoteSound", "handleNoiseGate", "(JZ)Z", "o/ny", "MultimediaLegacyLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NativeAudioInterface {
    public final ny a;
    public final ny b;

    public NativeAudioInterface(ny nyVar, ny nyVar2) {
        this.a = nyVar;
        this.b = nyVar2;
    }

    private final void callbackHandleEnableNoiseGate(boolean enable) {
        wy wyVar = this.b.a;
        if (wyVar.d == ty.p) {
            bk7 bk7Var = bk7.TVCmdMMNoiseGateEnable;
            KnownStreams knownStreams = KnownStreams.DefaultStream_Audio;
            ((a2) wyVar.w).m.e(fx3.n(knownStreams, bk7Var, knownStreams));
        }
    }

    private final void callbackHandleRecordedData(byte[] data) {
        wy wyVar = this.a.a;
        data.getClass();
        ec3 ec3Var = wyVar.w;
        if (wyVar.d != ty.p || data.length == 0) {
            return;
        }
        bk7 bk7Var = bk7.TVCmdMMAudData;
        KnownStreams knownStreams = KnownStreams.DefaultStream_Audio;
        ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
        ak7VarN.a(kj7.m, data);
        a2 a2Var = (a2) ec3Var;
        pg5 pg5Var = a2Var.r;
        if (pg5Var.a.AllowedToSpeak(pg5Var.b())) {
            a2Var.m.e(ak7VarN);
        }
    }

    public final native boolean addAudioSourceToMixedSource(long mixedID, long sourceID);

    public final native boolean createAudioSourceMixed(long id, int samplesPerSecond, int bitsPerSample);

    public final native boolean createAudioSourceOpus(long id, int samplesPerSecond, int bitsPerSample, int channels, int framesPerPacket, int framesSize);

    public final native boolean createAudioSourcePCM(long id, int samplesPerSecond, int bitsPerSample);

    public final native boolean createAudioSourceSpeex(long id, int samplesPerSecond, int bitsPerSample, int framesPerPacket, int framesSize, int bitrate, int quality, int complexity, int variableBitrate, int voiceActivityDetection, int discontinuousTransmission);

    public final native boolean destroyAudioSource(long id);

    public final native boolean handleNoiseGate(long id, boolean enable);

    public final native boolean initAudioRemoteSound(int samplesPerSecond, int bitsPerSample, int channels);

    public final native boolean initAudioVOIP();

    public final native boolean playAudio(boolean play);

    public final native boolean playRemoteAudio(boolean play);

    public final native boolean recordAudio(boolean record);

    public final native boolean removeAudioSourceFromMixedSource(long mixedID, long sourceID);

    public final native boolean setAudioSourceRemoteSound(long id);

    public final native boolean setAudioSourceVOIP(long id);

    public final native boolean shutdownAudio();

    public final native boolean updateAudioSourceRemoteSound(long id, long addr);

    public final native boolean updateAudioSourceVOIP(long id, byte[] data);
}
