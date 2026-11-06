package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.teamviewer.multimedialegacylib.audio.NativeAudioInterface;
import com.teamviewer.outgoingsessionlib.swig.StreamFeatures_Getters;
import com.teamviewer.outgoingsessionlib.swig.StreamType;
import com.teamviewer.outgoingsessionlib.swig.TParticipantIdentifierVector;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wy {
    public final oy A;
    public final oy B;
    public final oy C;
    public final oy D;
    public final oy E;
    public final oy F;
    public final oy G;
    public final Settings a;
    public NativeAudioInterface b;
    public py c;
    public ty d;
    public ry e;
    public qy f;
    public sy g;
    public final sy h;
    public final uy i;
    public final HashMap j;
    public final HashMap k;
    public final az l;
    public int m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2460o;
    public boolean p;
    public ParticipantIdentifier q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final ec3 w;
    public final EventHub x;
    public final Context y;
    public final oy z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [o.oy, o.vd2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o.oy, o.vd2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [o.oy, o.vd2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [o.oy, o.vd2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [o.oy, o.vd2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [o.oy, o.vd2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [o.oy, o.vd2] */
    /* JADX WARN: Type inference failed for: r7v1, types: [o.oy, o.vd2] */
    public wy(Context context, ec3 ec3Var, EventHub eventHub, SharedPreferences sharedPreferences, Settings settings) {
        context.getClass();
        ec3Var.getClass();
        eventHub.getClass();
        sharedPreferences.getClass();
        settings.getClass();
        this.a = settings;
        py pyVar = py.m;
        this.c = pyVar;
        this.d = ty.m;
        this.e = ry.m;
        this.f = qy.m;
        sy syVar = sy.m;
        this.g = syVar;
        this.h = syVar;
        this.i = new uy(this);
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new az();
        this.q = ParticipantIdentifier.getInvalid();
        final byte b = 1;
        this.t = true;
        final byte b2 = 0;
        ?? r0 = new vd2(this) { // from class: o.oy
            public final /* synthetic */ wy b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                int i;
                int i2;
                byte b3 = b2;
                wy wyVar = this.b;
                switch (b3) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        ParticipantIdentifier participantIdentifierDeserialize = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
                        HashMap map = wyVar.k;
                        if (((bz) map.get(Long.valueOf(participantIdentifierDeserialize.toInt64()))) != null) {
                            ye4.c("AudioManager", "ParticipantAdded: participant already in list");
                        } else {
                            map.put(Long.valueOf(participantIdentifierDeserialize.toInt64()), new bz());
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        wyVar.k.remove(Long.valueOf(ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID)).toInt64()));
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        if ((streamTypeSwigToEnum != null ? vy.b[streamTypeSwigToEnum.ordinal()] : -1) == 3) {
                            EventParam eventParam = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam.getClass();
                            Boolean bool = (Boolean) he2Var.i(eventParam);
                            if (bool != null ? bool.booleanValue() : false) {
                                ec3 ec3Var2 = wyVar.w;
                                if (wyVar.e != ry.f1964o) {
                                    int i3 = wyVar.f != qy.f1876o ? 0 : 1;
                                    bk7 bk7Var = bk7.TVCmdMMAdjust;
                                    KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                                    ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
                                    if (i3 == 0) {
                                        ye4.c("AudioManager", "restartStream: playback not active");
                                    }
                                    ak7VarN.b(jj7.TVCmdMMAdjustAudioActive, (byte) i3);
                                    ak7VarN.b(jj7.TVCmdMMAdjustVideoActive, (byte) 0);
                                    ak7VarN.A();
                                    ((a2) ec3Var2).m.e(ak7VarN);
                                } else {
                                    az azVar = wyVar.l;
                                    ye4.a("AudioManager", "sending own audio init command");
                                    bk7 bk7Var2 = bk7.TVCmdMMInit;
                                    KnownStreams knownStreams2 = KnownStreams.DefaultStream_Audio;
                                    knownStreams2.getClass();
                                    ak7 ak7Var = new ak7(bk7Var2);
                                    ak7Var.z(knownStreams2);
                                    ak7Var.A();
                                    azVar.getClass();
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavBps, azVar.c);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavChan, azVar.d);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavSps, azVar.b);
                                    ju juVar = uv4.m;
                                    ak7Var.d(lj7.TVCmdMMChangeCodecType, 1);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxBitrate, azVar.f);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxVbr, azVar.i);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxCmplx, azVar.h);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxQual, azVar.g);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxVad, azVar.j);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxDtx, azVar.k);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxFpp, azVar.e);
                                    ((a2) ec3Var2).m.e(ak7Var);
                                }
                            }
                        }
                        break;
                    case 3:
                        ec3 ec3Var3 = wyVar.w;
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum2 = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        i = streamTypeSwigToEnum2 != null ? vy.b[streamTypeSwigToEnum2.ordinal()] : -1;
                        if (i == 1 || i == 2) {
                            ParticipantIdentifier participantIdentifierDeserialize2 = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
                            long jG = he2Var.g(EventParam.EPARAM_STREAM_ID);
                            participantIdentifierDeserialize2.getClass();
                            EventParam eventParam2 = EventParam.EPARAM_STREAM_REQUIRED_FEATURES;
                            eventParam2.getClass();
                            Long l = (Long) he2Var.i(eventParam2);
                            long jLongValue = l != null ? l.longValue() : 0L;
                            ye4.a("AudioManager", "handle new audio stream: " + jG);
                            int i4 = vy.b[streamTypeSwigToEnum2.ordinal()];
                            if (i4 == 1) {
                                Settings settings2 = wyVar.a;
                                ca8 ca8Var = ca8.P_REMOTEAUDIO_RECEIVE_ENABLED;
                                settings2.getClass();
                                if (!Settings.a(gv6.USER, ca8Var)) {
                                    ye4.a("AudioManager", "Audio control stream not registered: Remote audio disabled by user.");
                                    wyVar.t = false;
                                    if (wyVar.p && (i2 = wyVar.f2460o) != 0) {
                                        wyVar.p = false;
                                        ((a2) ec3Var3).r.c(i2, false);
                                    }
                                }
                                ye4.a("AudioManager", "Remote audio control stream registered: " + jG + " from: " + participantIdentifierDeserialize2);
                                if (wyVar.f2460o != 0) {
                                    wyVar.f2460o = 0;
                                    wyVar.p = false;
                                    wyVar.m = 0;
                                    wyVar.n = false;
                                }
                                if ((StreamFeatures_Getters.GetOwnSupportedStreamFeatures(streamTypeSwigToEnum2) & jLongValue) != jLongValue) {
                                    ye4.c("AudioManager", "?! requested stream features not supported - please update App ?!");
                                    break;
                                } else {
                                    int i5 = (int) jG;
                                    wyVar.f2460o = i5;
                                    wyVar.q = participantIdentifierDeserialize2;
                                    boolean z = wyVar.t;
                                    if (z != wyVar.p && i5 != 0) {
                                        wyVar.p = z;
                                        ((a2) ec3Var3).r.c(i5, z);
                                        break;
                                    }
                                }
                            } else if (i4 == 2) {
                                ye4.a("AudioManager", "Remote audio data stream registered: " + jG + " from: " + participantIdentifierDeserialize2);
                                if ((StreamFeatures_Getters.GetOwnSupportedStreamFeatures(streamTypeSwigToEnum2) & jLongValue) != jLongValue) {
                                    ye4.c("AudioManager", "?! requested stream features not supported - please update App ?!");
                                } else {
                                    wyVar.m = (int) jG;
                                    wyVar.m();
                                }
                                break;
                            }
                        }
                        break;
                    case 4:
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum3 = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        int i6 = streamTypeSwigToEnum3 == null ? -1 : vy.b[streamTypeSwigToEnum3.ordinal()];
                        if (i6 == 2) {
                            EventParam eventParam3 = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam3.getClass();
                            Boolean bool2 = (Boolean) he2Var.i(eventParam3);
                            if (!(bool2 != null ? bool2.booleanValue() : false)) {
                                ye4.a("AudioManager", "handle close audio stream: " + he2Var.g(EventParam.EPARAM_STREAM_ID));
                                i = streamTypeSwigToEnum3 != null ? vy.b[streamTypeSwigToEnum3.ordinal()] : -1;
                                if (i == 1) {
                                    wyVar.f2460o = 0;
                                    wyVar.p = false;
                                    wyVar.m = 0;
                                    wyVar.n = false;
                                } else if (i == 2 && wyVar.b(2L) != null) {
                                    wyVar.d(false);
                                    wyVar.n = false;
                                    wyVar.m = 0;
                                }
                            }
                            break;
                        } else if (i6 == 3) {
                            EventParam eventParam4 = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam4.getClass();
                            Boolean bool3 = (Boolean) he2Var.i(eventParam4);
                            if (bool3 != null ? bool3.booleanValue() : false) {
                                wyVar.h(true);
                            }
                            break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        sy syVar2 = wyVar.h;
                        sy syVar3 = sy.p;
                        if (syVar2 != syVar3 && wyVar.n) {
                            wyVar.d(true);
                        } else if (syVar2 == syVar3) {
                            wyVar.e(false);
                        }
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        wyVar.d(false);
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        bu7.MAIN.a(new io.sentry.b5((Object) wyVar, (byte) 27));
                        break;
                }
            }
        };
        this.z = r0;
        ?? r1 = new vd2(this) { // from class: o.oy
            public final /* synthetic */ wy b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                int i;
                int i2;
                byte b3 = b;
                wy wyVar = this.b;
                switch (b3) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        ParticipantIdentifier participantIdentifierDeserialize = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
                        HashMap map = wyVar.k;
                        if (((bz) map.get(Long.valueOf(participantIdentifierDeserialize.toInt64()))) != null) {
                            ye4.c("AudioManager", "ParticipantAdded: participant already in list");
                        } else {
                            map.put(Long.valueOf(participantIdentifierDeserialize.toInt64()), new bz());
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        wyVar.k.remove(Long.valueOf(ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID)).toInt64()));
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        if ((streamTypeSwigToEnum != null ? vy.b[streamTypeSwigToEnum.ordinal()] : -1) == 3) {
                            EventParam eventParam = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam.getClass();
                            Boolean bool = (Boolean) he2Var.i(eventParam);
                            if (bool != null ? bool.booleanValue() : false) {
                                ec3 ec3Var2 = wyVar.w;
                                if (wyVar.e != ry.f1964o) {
                                    int i3 = wyVar.f != qy.f1876o ? 0 : 1;
                                    bk7 bk7Var = bk7.TVCmdMMAdjust;
                                    KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                                    ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
                                    if (i3 == 0) {
                                        ye4.c("AudioManager", "restartStream: playback not active");
                                    }
                                    ak7VarN.b(jj7.TVCmdMMAdjustAudioActive, (byte) i3);
                                    ak7VarN.b(jj7.TVCmdMMAdjustVideoActive, (byte) 0);
                                    ak7VarN.A();
                                    ((a2) ec3Var2).m.e(ak7VarN);
                                } else {
                                    az azVar = wyVar.l;
                                    ye4.a("AudioManager", "sending own audio init command");
                                    bk7 bk7Var2 = bk7.TVCmdMMInit;
                                    KnownStreams knownStreams2 = KnownStreams.DefaultStream_Audio;
                                    knownStreams2.getClass();
                                    ak7 ak7Var = new ak7(bk7Var2);
                                    ak7Var.z(knownStreams2);
                                    ak7Var.A();
                                    azVar.getClass();
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavBps, azVar.c);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavChan, azVar.d);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavSps, azVar.b);
                                    ju juVar = uv4.m;
                                    ak7Var.d(lj7.TVCmdMMChangeCodecType, 1);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxBitrate, azVar.f);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxVbr, azVar.i);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxCmplx, azVar.h);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxQual, azVar.g);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxVad, azVar.j);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxDtx, azVar.k);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxFpp, azVar.e);
                                    ((a2) ec3Var2).m.e(ak7Var);
                                }
                            }
                        }
                        break;
                    case 3:
                        ec3 ec3Var3 = wyVar.w;
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum2 = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        i = streamTypeSwigToEnum2 != null ? vy.b[streamTypeSwigToEnum2.ordinal()] : -1;
                        if (i == 1 || i == 2) {
                            ParticipantIdentifier participantIdentifierDeserialize2 = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
                            long jG = he2Var.g(EventParam.EPARAM_STREAM_ID);
                            participantIdentifierDeserialize2.getClass();
                            EventParam eventParam2 = EventParam.EPARAM_STREAM_REQUIRED_FEATURES;
                            eventParam2.getClass();
                            Long l = (Long) he2Var.i(eventParam2);
                            long jLongValue = l != null ? l.longValue() : 0L;
                            ye4.a("AudioManager", "handle new audio stream: " + jG);
                            int i4 = vy.b[streamTypeSwigToEnum2.ordinal()];
                            if (i4 == 1) {
                                Settings settings2 = wyVar.a;
                                ca8 ca8Var = ca8.P_REMOTEAUDIO_RECEIVE_ENABLED;
                                settings2.getClass();
                                if (!Settings.a(gv6.USER, ca8Var)) {
                                    ye4.a("AudioManager", "Audio control stream not registered: Remote audio disabled by user.");
                                    wyVar.t = false;
                                    if (wyVar.p && (i2 = wyVar.f2460o) != 0) {
                                        wyVar.p = false;
                                        ((a2) ec3Var3).r.c(i2, false);
                                    }
                                }
                                ye4.a("AudioManager", "Remote audio control stream registered: " + jG + " from: " + participantIdentifierDeserialize2);
                                if (wyVar.f2460o != 0) {
                                    wyVar.f2460o = 0;
                                    wyVar.p = false;
                                    wyVar.m = 0;
                                    wyVar.n = false;
                                }
                                if ((StreamFeatures_Getters.GetOwnSupportedStreamFeatures(streamTypeSwigToEnum2) & jLongValue) != jLongValue) {
                                    ye4.c("AudioManager", "?! requested stream features not supported - please update App ?!");
                                    break;
                                } else {
                                    int i5 = (int) jG;
                                    wyVar.f2460o = i5;
                                    wyVar.q = participantIdentifierDeserialize2;
                                    boolean z = wyVar.t;
                                    if (z != wyVar.p && i5 != 0) {
                                        wyVar.p = z;
                                        ((a2) ec3Var3).r.c(i5, z);
                                        break;
                                    }
                                }
                            } else if (i4 == 2) {
                                ye4.a("AudioManager", "Remote audio data stream registered: " + jG + " from: " + participantIdentifierDeserialize2);
                                if ((StreamFeatures_Getters.GetOwnSupportedStreamFeatures(streamTypeSwigToEnum2) & jLongValue) != jLongValue) {
                                    ye4.c("AudioManager", "?! requested stream features not supported - please update App ?!");
                                } else {
                                    wyVar.m = (int) jG;
                                    wyVar.m();
                                }
                                break;
                            }
                        }
                        break;
                    case 4:
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum3 = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        int i6 = streamTypeSwigToEnum3 == null ? -1 : vy.b[streamTypeSwigToEnum3.ordinal()];
                        if (i6 == 2) {
                            EventParam eventParam3 = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam3.getClass();
                            Boolean bool2 = (Boolean) he2Var.i(eventParam3);
                            if (!(bool2 != null ? bool2.booleanValue() : false)) {
                                ye4.a("AudioManager", "handle close audio stream: " + he2Var.g(EventParam.EPARAM_STREAM_ID));
                                i = streamTypeSwigToEnum3 != null ? vy.b[streamTypeSwigToEnum3.ordinal()] : -1;
                                if (i == 1) {
                                    wyVar.f2460o = 0;
                                    wyVar.p = false;
                                    wyVar.m = 0;
                                    wyVar.n = false;
                                } else if (i == 2 && wyVar.b(2L) != null) {
                                    wyVar.d(false);
                                    wyVar.n = false;
                                    wyVar.m = 0;
                                }
                            }
                            break;
                        } else if (i6 == 3) {
                            EventParam eventParam4 = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam4.getClass();
                            Boolean bool3 = (Boolean) he2Var.i(eventParam4);
                            if (bool3 != null ? bool3.booleanValue() : false) {
                                wyVar.h(true);
                            }
                            break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        sy syVar2 = wyVar.h;
                        sy syVar3 = sy.p;
                        if (syVar2 != syVar3 && wyVar.n) {
                            wyVar.d(true);
                        } else if (syVar2 == syVar3) {
                            wyVar.e(false);
                        }
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        wyVar.d(false);
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        bu7.MAIN.a(new io.sentry.b5((Object) wyVar, (byte) 27));
                        break;
                }
            }
        };
        this.A = r1;
        final byte b3 = 2;
        ?? r2 = new vd2(this) { // from class: o.oy
            public final /* synthetic */ wy b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                int i;
                int i2;
                byte b4 = b3;
                wy wyVar = this.b;
                switch (b4) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        ParticipantIdentifier participantIdentifierDeserialize = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
                        HashMap map = wyVar.k;
                        if (((bz) map.get(Long.valueOf(participantIdentifierDeserialize.toInt64()))) != null) {
                            ye4.c("AudioManager", "ParticipantAdded: participant already in list");
                        } else {
                            map.put(Long.valueOf(participantIdentifierDeserialize.toInt64()), new bz());
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        wyVar.k.remove(Long.valueOf(ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID)).toInt64()));
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        if ((streamTypeSwigToEnum != null ? vy.b[streamTypeSwigToEnum.ordinal()] : -1) == 3) {
                            EventParam eventParam = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam.getClass();
                            Boolean bool = (Boolean) he2Var.i(eventParam);
                            if (bool != null ? bool.booleanValue() : false) {
                                ec3 ec3Var2 = wyVar.w;
                                if (wyVar.e != ry.f1964o) {
                                    int i3 = wyVar.f != qy.f1876o ? 0 : 1;
                                    bk7 bk7Var = bk7.TVCmdMMAdjust;
                                    KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                                    ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
                                    if (i3 == 0) {
                                        ye4.c("AudioManager", "restartStream: playback not active");
                                    }
                                    ak7VarN.b(jj7.TVCmdMMAdjustAudioActive, (byte) i3);
                                    ak7VarN.b(jj7.TVCmdMMAdjustVideoActive, (byte) 0);
                                    ak7VarN.A();
                                    ((a2) ec3Var2).m.e(ak7VarN);
                                } else {
                                    az azVar = wyVar.l;
                                    ye4.a("AudioManager", "sending own audio init command");
                                    bk7 bk7Var2 = bk7.TVCmdMMInit;
                                    KnownStreams knownStreams2 = KnownStreams.DefaultStream_Audio;
                                    knownStreams2.getClass();
                                    ak7 ak7Var = new ak7(bk7Var2);
                                    ak7Var.z(knownStreams2);
                                    ak7Var.A();
                                    azVar.getClass();
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavBps, azVar.c);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavChan, azVar.d);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavSps, azVar.b);
                                    ju juVar = uv4.m;
                                    ak7Var.d(lj7.TVCmdMMChangeCodecType, 1);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxBitrate, azVar.f);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxVbr, azVar.i);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxCmplx, azVar.h);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxQual, azVar.g);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxVad, azVar.j);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxDtx, azVar.k);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxFpp, azVar.e);
                                    ((a2) ec3Var2).m.e(ak7Var);
                                }
                            }
                        }
                        break;
                    case 3:
                        ec3 ec3Var3 = wyVar.w;
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum2 = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        i = streamTypeSwigToEnum2 != null ? vy.b[streamTypeSwigToEnum2.ordinal()] : -1;
                        if (i == 1 || i == 2) {
                            ParticipantIdentifier participantIdentifierDeserialize2 = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
                            long jG = he2Var.g(EventParam.EPARAM_STREAM_ID);
                            participantIdentifierDeserialize2.getClass();
                            EventParam eventParam2 = EventParam.EPARAM_STREAM_REQUIRED_FEATURES;
                            eventParam2.getClass();
                            Long l = (Long) he2Var.i(eventParam2);
                            long jLongValue = l != null ? l.longValue() : 0L;
                            ye4.a("AudioManager", "handle new audio stream: " + jG);
                            int i4 = vy.b[streamTypeSwigToEnum2.ordinal()];
                            if (i4 == 1) {
                                Settings settings2 = wyVar.a;
                                ca8 ca8Var = ca8.P_REMOTEAUDIO_RECEIVE_ENABLED;
                                settings2.getClass();
                                if (!Settings.a(gv6.USER, ca8Var)) {
                                    ye4.a("AudioManager", "Audio control stream not registered: Remote audio disabled by user.");
                                    wyVar.t = false;
                                    if (wyVar.p && (i2 = wyVar.f2460o) != 0) {
                                        wyVar.p = false;
                                        ((a2) ec3Var3).r.c(i2, false);
                                    }
                                }
                                ye4.a("AudioManager", "Remote audio control stream registered: " + jG + " from: " + participantIdentifierDeserialize2);
                                if (wyVar.f2460o != 0) {
                                    wyVar.f2460o = 0;
                                    wyVar.p = false;
                                    wyVar.m = 0;
                                    wyVar.n = false;
                                }
                                if ((StreamFeatures_Getters.GetOwnSupportedStreamFeatures(streamTypeSwigToEnum2) & jLongValue) != jLongValue) {
                                    ye4.c("AudioManager", "?! requested stream features not supported - please update App ?!");
                                    break;
                                } else {
                                    int i5 = (int) jG;
                                    wyVar.f2460o = i5;
                                    wyVar.q = participantIdentifierDeserialize2;
                                    boolean z = wyVar.t;
                                    if (z != wyVar.p && i5 != 0) {
                                        wyVar.p = z;
                                        ((a2) ec3Var3).r.c(i5, z);
                                        break;
                                    }
                                }
                            } else if (i4 == 2) {
                                ye4.a("AudioManager", "Remote audio data stream registered: " + jG + " from: " + participantIdentifierDeserialize2);
                                if ((StreamFeatures_Getters.GetOwnSupportedStreamFeatures(streamTypeSwigToEnum2) & jLongValue) != jLongValue) {
                                    ye4.c("AudioManager", "?! requested stream features not supported - please update App ?!");
                                } else {
                                    wyVar.m = (int) jG;
                                    wyVar.m();
                                }
                                break;
                            }
                        }
                        break;
                    case 4:
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum3 = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        int i6 = streamTypeSwigToEnum3 == null ? -1 : vy.b[streamTypeSwigToEnum3.ordinal()];
                        if (i6 == 2) {
                            EventParam eventParam3 = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam3.getClass();
                            Boolean bool2 = (Boolean) he2Var.i(eventParam3);
                            if (!(bool2 != null ? bool2.booleanValue() : false)) {
                                ye4.a("AudioManager", "handle close audio stream: " + he2Var.g(EventParam.EPARAM_STREAM_ID));
                                i = streamTypeSwigToEnum3 != null ? vy.b[streamTypeSwigToEnum3.ordinal()] : -1;
                                if (i == 1) {
                                    wyVar.f2460o = 0;
                                    wyVar.p = false;
                                    wyVar.m = 0;
                                    wyVar.n = false;
                                } else if (i == 2 && wyVar.b(2L) != null) {
                                    wyVar.d(false);
                                    wyVar.n = false;
                                    wyVar.m = 0;
                                }
                            }
                            break;
                        } else if (i6 == 3) {
                            EventParam eventParam4 = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam4.getClass();
                            Boolean bool3 = (Boolean) he2Var.i(eventParam4);
                            if (bool3 != null ? bool3.booleanValue() : false) {
                                wyVar.h(true);
                            }
                            break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        sy syVar2 = wyVar.h;
                        sy syVar3 = sy.p;
                        if (syVar2 != syVar3 && wyVar.n) {
                            wyVar.d(true);
                        } else if (syVar2 == syVar3) {
                            wyVar.e(false);
                        }
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        wyVar.d(false);
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        bu7.MAIN.a(new io.sentry.b5((Object) wyVar, (byte) 27));
                        break;
                }
            }
        };
        this.B = r2;
        final byte b4 = 3;
        ?? r3 = new vd2(this) { // from class: o.oy
            public final /* synthetic */ wy b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                int i;
                int i2;
                byte b5 = b4;
                wy wyVar = this.b;
                switch (b5) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        ParticipantIdentifier participantIdentifierDeserialize = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
                        HashMap map = wyVar.k;
                        if (((bz) map.get(Long.valueOf(participantIdentifierDeserialize.toInt64()))) != null) {
                            ye4.c("AudioManager", "ParticipantAdded: participant already in list");
                        } else {
                            map.put(Long.valueOf(participantIdentifierDeserialize.toInt64()), new bz());
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        wyVar.k.remove(Long.valueOf(ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID)).toInt64()));
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        if ((streamTypeSwigToEnum != null ? vy.b[streamTypeSwigToEnum.ordinal()] : -1) == 3) {
                            EventParam eventParam = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam.getClass();
                            Boolean bool = (Boolean) he2Var.i(eventParam);
                            if (bool != null ? bool.booleanValue() : false) {
                                ec3 ec3Var2 = wyVar.w;
                                if (wyVar.e != ry.f1964o) {
                                    int i3 = wyVar.f != qy.f1876o ? 0 : 1;
                                    bk7 bk7Var = bk7.TVCmdMMAdjust;
                                    KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                                    ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
                                    if (i3 == 0) {
                                        ye4.c("AudioManager", "restartStream: playback not active");
                                    }
                                    ak7VarN.b(jj7.TVCmdMMAdjustAudioActive, (byte) i3);
                                    ak7VarN.b(jj7.TVCmdMMAdjustVideoActive, (byte) 0);
                                    ak7VarN.A();
                                    ((a2) ec3Var2).m.e(ak7VarN);
                                } else {
                                    az azVar = wyVar.l;
                                    ye4.a("AudioManager", "sending own audio init command");
                                    bk7 bk7Var2 = bk7.TVCmdMMInit;
                                    KnownStreams knownStreams2 = KnownStreams.DefaultStream_Audio;
                                    knownStreams2.getClass();
                                    ak7 ak7Var = new ak7(bk7Var2);
                                    ak7Var.z(knownStreams2);
                                    ak7Var.A();
                                    azVar.getClass();
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavBps, azVar.c);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavChan, azVar.d);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavSps, azVar.b);
                                    ju juVar = uv4.m;
                                    ak7Var.d(lj7.TVCmdMMChangeCodecType, 1);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxBitrate, azVar.f);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxVbr, azVar.i);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxCmplx, azVar.h);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxQual, azVar.g);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxVad, azVar.j);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxDtx, azVar.k);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxFpp, azVar.e);
                                    ((a2) ec3Var2).m.e(ak7Var);
                                }
                            }
                        }
                        break;
                    case 3:
                        ec3 ec3Var3 = wyVar.w;
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum2 = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        i = streamTypeSwigToEnum2 != null ? vy.b[streamTypeSwigToEnum2.ordinal()] : -1;
                        if (i == 1 || i == 2) {
                            ParticipantIdentifier participantIdentifierDeserialize2 = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
                            long jG = he2Var.g(EventParam.EPARAM_STREAM_ID);
                            participantIdentifierDeserialize2.getClass();
                            EventParam eventParam2 = EventParam.EPARAM_STREAM_REQUIRED_FEATURES;
                            eventParam2.getClass();
                            Long l = (Long) he2Var.i(eventParam2);
                            long jLongValue = l != null ? l.longValue() : 0L;
                            ye4.a("AudioManager", "handle new audio stream: " + jG);
                            int i4 = vy.b[streamTypeSwigToEnum2.ordinal()];
                            if (i4 == 1) {
                                Settings settings2 = wyVar.a;
                                ca8 ca8Var = ca8.P_REMOTEAUDIO_RECEIVE_ENABLED;
                                settings2.getClass();
                                if (!Settings.a(gv6.USER, ca8Var)) {
                                    ye4.a("AudioManager", "Audio control stream not registered: Remote audio disabled by user.");
                                    wyVar.t = false;
                                    if (wyVar.p && (i2 = wyVar.f2460o) != 0) {
                                        wyVar.p = false;
                                        ((a2) ec3Var3).r.c(i2, false);
                                    }
                                }
                                ye4.a("AudioManager", "Remote audio control stream registered: " + jG + " from: " + participantIdentifierDeserialize2);
                                if (wyVar.f2460o != 0) {
                                    wyVar.f2460o = 0;
                                    wyVar.p = false;
                                    wyVar.m = 0;
                                    wyVar.n = false;
                                }
                                if ((StreamFeatures_Getters.GetOwnSupportedStreamFeatures(streamTypeSwigToEnum2) & jLongValue) != jLongValue) {
                                    ye4.c("AudioManager", "?! requested stream features not supported - please update App ?!");
                                    break;
                                } else {
                                    int i5 = (int) jG;
                                    wyVar.f2460o = i5;
                                    wyVar.q = participantIdentifierDeserialize2;
                                    boolean z = wyVar.t;
                                    if (z != wyVar.p && i5 != 0) {
                                        wyVar.p = z;
                                        ((a2) ec3Var3).r.c(i5, z);
                                        break;
                                    }
                                }
                            } else if (i4 == 2) {
                                ye4.a("AudioManager", "Remote audio data stream registered: " + jG + " from: " + participantIdentifierDeserialize2);
                                if ((StreamFeatures_Getters.GetOwnSupportedStreamFeatures(streamTypeSwigToEnum2) & jLongValue) != jLongValue) {
                                    ye4.c("AudioManager", "?! requested stream features not supported - please update App ?!");
                                } else {
                                    wyVar.m = (int) jG;
                                    wyVar.m();
                                }
                                break;
                            }
                        }
                        break;
                    case 4:
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum3 = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        int i6 = streamTypeSwigToEnum3 == null ? -1 : vy.b[streamTypeSwigToEnum3.ordinal()];
                        if (i6 == 2) {
                            EventParam eventParam3 = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam3.getClass();
                            Boolean bool2 = (Boolean) he2Var.i(eventParam3);
                            if (!(bool2 != null ? bool2.booleanValue() : false)) {
                                ye4.a("AudioManager", "handle close audio stream: " + he2Var.g(EventParam.EPARAM_STREAM_ID));
                                i = streamTypeSwigToEnum3 != null ? vy.b[streamTypeSwigToEnum3.ordinal()] : -1;
                                if (i == 1) {
                                    wyVar.f2460o = 0;
                                    wyVar.p = false;
                                    wyVar.m = 0;
                                    wyVar.n = false;
                                } else if (i == 2 && wyVar.b(2L) != null) {
                                    wyVar.d(false);
                                    wyVar.n = false;
                                    wyVar.m = 0;
                                }
                            }
                            break;
                        } else if (i6 == 3) {
                            EventParam eventParam4 = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam4.getClass();
                            Boolean bool3 = (Boolean) he2Var.i(eventParam4);
                            if (bool3 != null ? bool3.booleanValue() : false) {
                                wyVar.h(true);
                            }
                            break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        sy syVar2 = wyVar.h;
                        sy syVar3 = sy.p;
                        if (syVar2 != syVar3 && wyVar.n) {
                            wyVar.d(true);
                        } else if (syVar2 == syVar3) {
                            wyVar.e(false);
                        }
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        wyVar.d(false);
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        bu7.MAIN.a(new io.sentry.b5((Object) wyVar, (byte) 27));
                        break;
                }
            }
        };
        this.C = r3;
        final byte b5 = 4;
        ?? r4 = new vd2(this) { // from class: o.oy
            public final /* synthetic */ wy b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                int i;
                int i2;
                byte b6 = b5;
                wy wyVar = this.b;
                switch (b6) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        ParticipantIdentifier participantIdentifierDeserialize = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
                        HashMap map = wyVar.k;
                        if (((bz) map.get(Long.valueOf(participantIdentifierDeserialize.toInt64()))) != null) {
                            ye4.c("AudioManager", "ParticipantAdded: participant already in list");
                        } else {
                            map.put(Long.valueOf(participantIdentifierDeserialize.toInt64()), new bz());
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        wyVar.k.remove(Long.valueOf(ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID)).toInt64()));
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        if ((streamTypeSwigToEnum != null ? vy.b[streamTypeSwigToEnum.ordinal()] : -1) == 3) {
                            EventParam eventParam = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam.getClass();
                            Boolean bool = (Boolean) he2Var.i(eventParam);
                            if (bool != null ? bool.booleanValue() : false) {
                                ec3 ec3Var2 = wyVar.w;
                                if (wyVar.e != ry.f1964o) {
                                    int i3 = wyVar.f != qy.f1876o ? 0 : 1;
                                    bk7 bk7Var = bk7.TVCmdMMAdjust;
                                    KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                                    ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
                                    if (i3 == 0) {
                                        ye4.c("AudioManager", "restartStream: playback not active");
                                    }
                                    ak7VarN.b(jj7.TVCmdMMAdjustAudioActive, (byte) i3);
                                    ak7VarN.b(jj7.TVCmdMMAdjustVideoActive, (byte) 0);
                                    ak7VarN.A();
                                    ((a2) ec3Var2).m.e(ak7VarN);
                                } else {
                                    az azVar = wyVar.l;
                                    ye4.a("AudioManager", "sending own audio init command");
                                    bk7 bk7Var2 = bk7.TVCmdMMInit;
                                    KnownStreams knownStreams2 = KnownStreams.DefaultStream_Audio;
                                    knownStreams2.getClass();
                                    ak7 ak7Var = new ak7(bk7Var2);
                                    ak7Var.z(knownStreams2);
                                    ak7Var.A();
                                    azVar.getClass();
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavBps, azVar.c);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavChan, azVar.d);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavSps, azVar.b);
                                    ju juVar = uv4.m;
                                    ak7Var.d(lj7.TVCmdMMChangeCodecType, 1);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxBitrate, azVar.f);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxVbr, azVar.i);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxCmplx, azVar.h);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxQual, azVar.g);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxVad, azVar.j);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxDtx, azVar.k);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxFpp, azVar.e);
                                    ((a2) ec3Var2).m.e(ak7Var);
                                }
                            }
                        }
                        break;
                    case 3:
                        ec3 ec3Var3 = wyVar.w;
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum2 = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        i = streamTypeSwigToEnum2 != null ? vy.b[streamTypeSwigToEnum2.ordinal()] : -1;
                        if (i == 1 || i == 2) {
                            ParticipantIdentifier participantIdentifierDeserialize2 = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
                            long jG = he2Var.g(EventParam.EPARAM_STREAM_ID);
                            participantIdentifierDeserialize2.getClass();
                            EventParam eventParam2 = EventParam.EPARAM_STREAM_REQUIRED_FEATURES;
                            eventParam2.getClass();
                            Long l = (Long) he2Var.i(eventParam2);
                            long jLongValue = l != null ? l.longValue() : 0L;
                            ye4.a("AudioManager", "handle new audio stream: " + jG);
                            int i4 = vy.b[streamTypeSwigToEnum2.ordinal()];
                            if (i4 == 1) {
                                Settings settings2 = wyVar.a;
                                ca8 ca8Var = ca8.P_REMOTEAUDIO_RECEIVE_ENABLED;
                                settings2.getClass();
                                if (!Settings.a(gv6.USER, ca8Var)) {
                                    ye4.a("AudioManager", "Audio control stream not registered: Remote audio disabled by user.");
                                    wyVar.t = false;
                                    if (wyVar.p && (i2 = wyVar.f2460o) != 0) {
                                        wyVar.p = false;
                                        ((a2) ec3Var3).r.c(i2, false);
                                    }
                                }
                                ye4.a("AudioManager", "Remote audio control stream registered: " + jG + " from: " + participantIdentifierDeserialize2);
                                if (wyVar.f2460o != 0) {
                                    wyVar.f2460o = 0;
                                    wyVar.p = false;
                                    wyVar.m = 0;
                                    wyVar.n = false;
                                }
                                if ((StreamFeatures_Getters.GetOwnSupportedStreamFeatures(streamTypeSwigToEnum2) & jLongValue) != jLongValue) {
                                    ye4.c("AudioManager", "?! requested stream features not supported - please update App ?!");
                                    break;
                                } else {
                                    int i5 = (int) jG;
                                    wyVar.f2460o = i5;
                                    wyVar.q = participantIdentifierDeserialize2;
                                    boolean z = wyVar.t;
                                    if (z != wyVar.p && i5 != 0) {
                                        wyVar.p = z;
                                        ((a2) ec3Var3).r.c(i5, z);
                                        break;
                                    }
                                }
                            } else if (i4 == 2) {
                                ye4.a("AudioManager", "Remote audio data stream registered: " + jG + " from: " + participantIdentifierDeserialize2);
                                if ((StreamFeatures_Getters.GetOwnSupportedStreamFeatures(streamTypeSwigToEnum2) & jLongValue) != jLongValue) {
                                    ye4.c("AudioManager", "?! requested stream features not supported - please update App ?!");
                                } else {
                                    wyVar.m = (int) jG;
                                    wyVar.m();
                                }
                                break;
                            }
                        }
                        break;
                    case 4:
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum3 = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        int i6 = streamTypeSwigToEnum3 == null ? -1 : vy.b[streamTypeSwigToEnum3.ordinal()];
                        if (i6 == 2) {
                            EventParam eventParam3 = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam3.getClass();
                            Boolean bool2 = (Boolean) he2Var.i(eventParam3);
                            if (!(bool2 != null ? bool2.booleanValue() : false)) {
                                ye4.a("AudioManager", "handle close audio stream: " + he2Var.g(EventParam.EPARAM_STREAM_ID));
                                i = streamTypeSwigToEnum3 != null ? vy.b[streamTypeSwigToEnum3.ordinal()] : -1;
                                if (i == 1) {
                                    wyVar.f2460o = 0;
                                    wyVar.p = false;
                                    wyVar.m = 0;
                                    wyVar.n = false;
                                } else if (i == 2 && wyVar.b(2L) != null) {
                                    wyVar.d(false);
                                    wyVar.n = false;
                                    wyVar.m = 0;
                                }
                            }
                            break;
                        } else if (i6 == 3) {
                            EventParam eventParam4 = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam4.getClass();
                            Boolean bool3 = (Boolean) he2Var.i(eventParam4);
                            if (bool3 != null ? bool3.booleanValue() : false) {
                                wyVar.h(true);
                            }
                            break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        sy syVar2 = wyVar.h;
                        sy syVar3 = sy.p;
                        if (syVar2 != syVar3 && wyVar.n) {
                            wyVar.d(true);
                        } else if (syVar2 == syVar3) {
                            wyVar.e(false);
                        }
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        wyVar.d(false);
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        bu7.MAIN.a(new io.sentry.b5((Object) wyVar, (byte) 27));
                        break;
                }
            }
        };
        this.D = r4;
        final byte b6 = 5;
        ?? r5 = new vd2(this) { // from class: o.oy
            public final /* synthetic */ wy b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                int i;
                int i2;
                byte b7 = b6;
                wy wyVar = this.b;
                switch (b7) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        ParticipantIdentifier participantIdentifierDeserialize = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
                        HashMap map = wyVar.k;
                        if (((bz) map.get(Long.valueOf(participantIdentifierDeserialize.toInt64()))) != null) {
                            ye4.c("AudioManager", "ParticipantAdded: participant already in list");
                        } else {
                            map.put(Long.valueOf(participantIdentifierDeserialize.toInt64()), new bz());
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        wyVar.k.remove(Long.valueOf(ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID)).toInt64()));
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        if ((streamTypeSwigToEnum != null ? vy.b[streamTypeSwigToEnum.ordinal()] : -1) == 3) {
                            EventParam eventParam = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam.getClass();
                            Boolean bool = (Boolean) he2Var.i(eventParam);
                            if (bool != null ? bool.booleanValue() : false) {
                                ec3 ec3Var2 = wyVar.w;
                                if (wyVar.e != ry.f1964o) {
                                    int i3 = wyVar.f != qy.f1876o ? 0 : 1;
                                    bk7 bk7Var = bk7.TVCmdMMAdjust;
                                    KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                                    ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
                                    if (i3 == 0) {
                                        ye4.c("AudioManager", "restartStream: playback not active");
                                    }
                                    ak7VarN.b(jj7.TVCmdMMAdjustAudioActive, (byte) i3);
                                    ak7VarN.b(jj7.TVCmdMMAdjustVideoActive, (byte) 0);
                                    ak7VarN.A();
                                    ((a2) ec3Var2).m.e(ak7VarN);
                                } else {
                                    az azVar = wyVar.l;
                                    ye4.a("AudioManager", "sending own audio init command");
                                    bk7 bk7Var2 = bk7.TVCmdMMInit;
                                    KnownStreams knownStreams2 = KnownStreams.DefaultStream_Audio;
                                    knownStreams2.getClass();
                                    ak7 ak7Var = new ak7(bk7Var2);
                                    ak7Var.z(knownStreams2);
                                    ak7Var.A();
                                    azVar.getClass();
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavBps, azVar.c);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavChan, azVar.d);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavSps, azVar.b);
                                    ju juVar = uv4.m;
                                    ak7Var.d(lj7.TVCmdMMChangeCodecType, 1);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxBitrate, azVar.f);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxVbr, azVar.i);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxCmplx, azVar.h);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxQual, azVar.g);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxVad, azVar.j);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxDtx, azVar.k);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxFpp, azVar.e);
                                    ((a2) ec3Var2).m.e(ak7Var);
                                }
                            }
                        }
                        break;
                    case 3:
                        ec3 ec3Var3 = wyVar.w;
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum2 = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        i = streamTypeSwigToEnum2 != null ? vy.b[streamTypeSwigToEnum2.ordinal()] : -1;
                        if (i == 1 || i == 2) {
                            ParticipantIdentifier participantIdentifierDeserialize2 = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
                            long jG = he2Var.g(EventParam.EPARAM_STREAM_ID);
                            participantIdentifierDeserialize2.getClass();
                            EventParam eventParam2 = EventParam.EPARAM_STREAM_REQUIRED_FEATURES;
                            eventParam2.getClass();
                            Long l = (Long) he2Var.i(eventParam2);
                            long jLongValue = l != null ? l.longValue() : 0L;
                            ye4.a("AudioManager", "handle new audio stream: " + jG);
                            int i4 = vy.b[streamTypeSwigToEnum2.ordinal()];
                            if (i4 == 1) {
                                Settings settings2 = wyVar.a;
                                ca8 ca8Var = ca8.P_REMOTEAUDIO_RECEIVE_ENABLED;
                                settings2.getClass();
                                if (!Settings.a(gv6.USER, ca8Var)) {
                                    ye4.a("AudioManager", "Audio control stream not registered: Remote audio disabled by user.");
                                    wyVar.t = false;
                                    if (wyVar.p && (i2 = wyVar.f2460o) != 0) {
                                        wyVar.p = false;
                                        ((a2) ec3Var3).r.c(i2, false);
                                    }
                                }
                                ye4.a("AudioManager", "Remote audio control stream registered: " + jG + " from: " + participantIdentifierDeserialize2);
                                if (wyVar.f2460o != 0) {
                                    wyVar.f2460o = 0;
                                    wyVar.p = false;
                                    wyVar.m = 0;
                                    wyVar.n = false;
                                }
                                if ((StreamFeatures_Getters.GetOwnSupportedStreamFeatures(streamTypeSwigToEnum2) & jLongValue) != jLongValue) {
                                    ye4.c("AudioManager", "?! requested stream features not supported - please update App ?!");
                                    break;
                                } else {
                                    int i5 = (int) jG;
                                    wyVar.f2460o = i5;
                                    wyVar.q = participantIdentifierDeserialize2;
                                    boolean z = wyVar.t;
                                    if (z != wyVar.p && i5 != 0) {
                                        wyVar.p = z;
                                        ((a2) ec3Var3).r.c(i5, z);
                                        break;
                                    }
                                }
                            } else if (i4 == 2) {
                                ye4.a("AudioManager", "Remote audio data stream registered: " + jG + " from: " + participantIdentifierDeserialize2);
                                if ((StreamFeatures_Getters.GetOwnSupportedStreamFeatures(streamTypeSwigToEnum2) & jLongValue) != jLongValue) {
                                    ye4.c("AudioManager", "?! requested stream features not supported - please update App ?!");
                                } else {
                                    wyVar.m = (int) jG;
                                    wyVar.m();
                                }
                                break;
                            }
                        }
                        break;
                    case 4:
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum3 = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        int i6 = streamTypeSwigToEnum3 == null ? -1 : vy.b[streamTypeSwigToEnum3.ordinal()];
                        if (i6 == 2) {
                            EventParam eventParam3 = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam3.getClass();
                            Boolean bool2 = (Boolean) he2Var.i(eventParam3);
                            if (!(bool2 != null ? bool2.booleanValue() : false)) {
                                ye4.a("AudioManager", "handle close audio stream: " + he2Var.g(EventParam.EPARAM_STREAM_ID));
                                i = streamTypeSwigToEnum3 != null ? vy.b[streamTypeSwigToEnum3.ordinal()] : -1;
                                if (i == 1) {
                                    wyVar.f2460o = 0;
                                    wyVar.p = false;
                                    wyVar.m = 0;
                                    wyVar.n = false;
                                } else if (i == 2 && wyVar.b(2L) != null) {
                                    wyVar.d(false);
                                    wyVar.n = false;
                                    wyVar.m = 0;
                                }
                            }
                            break;
                        } else if (i6 == 3) {
                            EventParam eventParam4 = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam4.getClass();
                            Boolean bool3 = (Boolean) he2Var.i(eventParam4);
                            if (bool3 != null ? bool3.booleanValue() : false) {
                                wyVar.h(true);
                            }
                            break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        sy syVar2 = wyVar.h;
                        sy syVar3 = sy.p;
                        if (syVar2 != syVar3 && wyVar.n) {
                            wyVar.d(true);
                        } else if (syVar2 == syVar3) {
                            wyVar.e(false);
                        }
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        wyVar.d(false);
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        bu7.MAIN.a(new io.sentry.b5((Object) wyVar, (byte) 27));
                        break;
                }
            }
        };
        this.E = r5;
        final byte b7 = 6;
        ?? r6 = new vd2(this) { // from class: o.oy
            public final /* synthetic */ wy b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                int i;
                int i2;
                byte b8 = b7;
                wy wyVar = this.b;
                switch (b8) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        ParticipantIdentifier participantIdentifierDeserialize = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
                        HashMap map = wyVar.k;
                        if (((bz) map.get(Long.valueOf(participantIdentifierDeserialize.toInt64()))) != null) {
                            ye4.c("AudioManager", "ParticipantAdded: participant already in list");
                        } else {
                            map.put(Long.valueOf(participantIdentifierDeserialize.toInt64()), new bz());
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        wyVar.k.remove(Long.valueOf(ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID)).toInt64()));
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        if ((streamTypeSwigToEnum != null ? vy.b[streamTypeSwigToEnum.ordinal()] : -1) == 3) {
                            EventParam eventParam = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam.getClass();
                            Boolean bool = (Boolean) he2Var.i(eventParam);
                            if (bool != null ? bool.booleanValue() : false) {
                                ec3 ec3Var2 = wyVar.w;
                                if (wyVar.e != ry.f1964o) {
                                    int i3 = wyVar.f != qy.f1876o ? 0 : 1;
                                    bk7 bk7Var = bk7.TVCmdMMAdjust;
                                    KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                                    ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
                                    if (i3 == 0) {
                                        ye4.c("AudioManager", "restartStream: playback not active");
                                    }
                                    ak7VarN.b(jj7.TVCmdMMAdjustAudioActive, (byte) i3);
                                    ak7VarN.b(jj7.TVCmdMMAdjustVideoActive, (byte) 0);
                                    ak7VarN.A();
                                    ((a2) ec3Var2).m.e(ak7VarN);
                                } else {
                                    az azVar = wyVar.l;
                                    ye4.a("AudioManager", "sending own audio init command");
                                    bk7 bk7Var2 = bk7.TVCmdMMInit;
                                    KnownStreams knownStreams2 = KnownStreams.DefaultStream_Audio;
                                    knownStreams2.getClass();
                                    ak7 ak7Var = new ak7(bk7Var2);
                                    ak7Var.z(knownStreams2);
                                    ak7Var.A();
                                    azVar.getClass();
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavBps, azVar.c);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavChan, azVar.d);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavSps, azVar.b);
                                    ju juVar = uv4.m;
                                    ak7Var.d(lj7.TVCmdMMChangeCodecType, 1);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxBitrate, azVar.f);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxVbr, azVar.i);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxCmplx, azVar.h);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxQual, azVar.g);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxVad, azVar.j);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxDtx, azVar.k);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxFpp, azVar.e);
                                    ((a2) ec3Var2).m.e(ak7Var);
                                }
                            }
                        }
                        break;
                    case 3:
                        ec3 ec3Var3 = wyVar.w;
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum2 = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        i = streamTypeSwigToEnum2 != null ? vy.b[streamTypeSwigToEnum2.ordinal()] : -1;
                        if (i == 1 || i == 2) {
                            ParticipantIdentifier participantIdentifierDeserialize2 = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
                            long jG = he2Var.g(EventParam.EPARAM_STREAM_ID);
                            participantIdentifierDeserialize2.getClass();
                            EventParam eventParam2 = EventParam.EPARAM_STREAM_REQUIRED_FEATURES;
                            eventParam2.getClass();
                            Long l = (Long) he2Var.i(eventParam2);
                            long jLongValue = l != null ? l.longValue() : 0L;
                            ye4.a("AudioManager", "handle new audio stream: " + jG);
                            int i4 = vy.b[streamTypeSwigToEnum2.ordinal()];
                            if (i4 == 1) {
                                Settings settings2 = wyVar.a;
                                ca8 ca8Var = ca8.P_REMOTEAUDIO_RECEIVE_ENABLED;
                                settings2.getClass();
                                if (!Settings.a(gv6.USER, ca8Var)) {
                                    ye4.a("AudioManager", "Audio control stream not registered: Remote audio disabled by user.");
                                    wyVar.t = false;
                                    if (wyVar.p && (i2 = wyVar.f2460o) != 0) {
                                        wyVar.p = false;
                                        ((a2) ec3Var3).r.c(i2, false);
                                    }
                                }
                                ye4.a("AudioManager", "Remote audio control stream registered: " + jG + " from: " + participantIdentifierDeserialize2);
                                if (wyVar.f2460o != 0) {
                                    wyVar.f2460o = 0;
                                    wyVar.p = false;
                                    wyVar.m = 0;
                                    wyVar.n = false;
                                }
                                if ((StreamFeatures_Getters.GetOwnSupportedStreamFeatures(streamTypeSwigToEnum2) & jLongValue) != jLongValue) {
                                    ye4.c("AudioManager", "?! requested stream features not supported - please update App ?!");
                                    break;
                                } else {
                                    int i5 = (int) jG;
                                    wyVar.f2460o = i5;
                                    wyVar.q = participantIdentifierDeserialize2;
                                    boolean z = wyVar.t;
                                    if (z != wyVar.p && i5 != 0) {
                                        wyVar.p = z;
                                        ((a2) ec3Var3).r.c(i5, z);
                                        break;
                                    }
                                }
                            } else if (i4 == 2) {
                                ye4.a("AudioManager", "Remote audio data stream registered: " + jG + " from: " + participantIdentifierDeserialize2);
                                if ((StreamFeatures_Getters.GetOwnSupportedStreamFeatures(streamTypeSwigToEnum2) & jLongValue) != jLongValue) {
                                    ye4.c("AudioManager", "?! requested stream features not supported - please update App ?!");
                                } else {
                                    wyVar.m = (int) jG;
                                    wyVar.m();
                                }
                                break;
                            }
                        }
                        break;
                    case 4:
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum3 = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        int i6 = streamTypeSwigToEnum3 == null ? -1 : vy.b[streamTypeSwigToEnum3.ordinal()];
                        if (i6 == 2) {
                            EventParam eventParam3 = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam3.getClass();
                            Boolean bool2 = (Boolean) he2Var.i(eventParam3);
                            if (!(bool2 != null ? bool2.booleanValue() : false)) {
                                ye4.a("AudioManager", "handle close audio stream: " + he2Var.g(EventParam.EPARAM_STREAM_ID));
                                i = streamTypeSwigToEnum3 != null ? vy.b[streamTypeSwigToEnum3.ordinal()] : -1;
                                if (i == 1) {
                                    wyVar.f2460o = 0;
                                    wyVar.p = false;
                                    wyVar.m = 0;
                                    wyVar.n = false;
                                } else if (i == 2 && wyVar.b(2L) != null) {
                                    wyVar.d(false);
                                    wyVar.n = false;
                                    wyVar.m = 0;
                                }
                            }
                            break;
                        } else if (i6 == 3) {
                            EventParam eventParam4 = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam4.getClass();
                            Boolean bool3 = (Boolean) he2Var.i(eventParam4);
                            if (bool3 != null ? bool3.booleanValue() : false) {
                                wyVar.h(true);
                            }
                            break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        sy syVar2 = wyVar.h;
                        sy syVar3 = sy.p;
                        if (syVar2 != syVar3 && wyVar.n) {
                            wyVar.d(true);
                        } else if (syVar2 == syVar3) {
                            wyVar.e(false);
                        }
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        wyVar.d(false);
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        bu7.MAIN.a(new io.sentry.b5((Object) wyVar, (byte) 27));
                        break;
                }
            }
        };
        this.F = r6;
        final byte b8 = 7;
        ?? r7 = new vd2(this) { // from class: o.oy
            public final /* synthetic */ wy b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                int i;
                int i2;
                byte b9 = b8;
                wy wyVar = this.b;
                switch (b9) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        ParticipantIdentifier participantIdentifierDeserialize = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
                        HashMap map = wyVar.k;
                        if (((bz) map.get(Long.valueOf(participantIdentifierDeserialize.toInt64()))) != null) {
                            ye4.c("AudioManager", "ParticipantAdded: participant already in list");
                        } else {
                            map.put(Long.valueOf(participantIdentifierDeserialize.toInt64()), new bz());
                        }
                        break;
                    case 1:
                        eventType.getClass();
                        he2Var.getClass();
                        wyVar.k.remove(Long.valueOf(ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID)).toInt64()));
                        break;
                    case 2:
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        if ((streamTypeSwigToEnum != null ? vy.b[streamTypeSwigToEnum.ordinal()] : -1) == 3) {
                            EventParam eventParam = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam.getClass();
                            Boolean bool = (Boolean) he2Var.i(eventParam);
                            if (bool != null ? bool.booleanValue() : false) {
                                ec3 ec3Var2 = wyVar.w;
                                if (wyVar.e != ry.f1964o) {
                                    int i3 = wyVar.f != qy.f1876o ? 0 : 1;
                                    bk7 bk7Var = bk7.TVCmdMMAdjust;
                                    KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                                    ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
                                    if (i3 == 0) {
                                        ye4.c("AudioManager", "restartStream: playback not active");
                                    }
                                    ak7VarN.b(jj7.TVCmdMMAdjustAudioActive, (byte) i3);
                                    ak7VarN.b(jj7.TVCmdMMAdjustVideoActive, (byte) 0);
                                    ak7VarN.A();
                                    ((a2) ec3Var2).m.e(ak7VarN);
                                } else {
                                    az azVar = wyVar.l;
                                    ye4.a("AudioManager", "sending own audio init command");
                                    bk7 bk7Var2 = bk7.TVCmdMMInit;
                                    KnownStreams knownStreams2 = KnownStreams.DefaultStream_Audio;
                                    knownStreams2.getClass();
                                    ak7 ak7Var = new ak7(bk7Var2);
                                    ak7Var.z(knownStreams2);
                                    ak7Var.A();
                                    azVar.getClass();
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavBps, azVar.c);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavChan, azVar.d);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecWavSps, azVar.b);
                                    ju juVar = uv4.m;
                                    ak7Var.d(lj7.TVCmdMMChangeCodecType, 1);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxBitrate, azVar.f);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxVbr, azVar.i);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxCmplx, azVar.h);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxQual, azVar.g);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxVad, azVar.j);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxDtx, azVar.k);
                                    ak7Var.d(lj7.TVCmdMMChangeCodecSpxFpp, azVar.e);
                                    ((a2) ec3Var2).m.e(ak7Var);
                                }
                            }
                        }
                        break;
                    case 3:
                        ec3 ec3Var3 = wyVar.w;
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum2 = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        i = streamTypeSwigToEnum2 != null ? vy.b[streamTypeSwigToEnum2.ordinal()] : -1;
                        if (i == 1 || i == 2) {
                            ParticipantIdentifier participantIdentifierDeserialize2 = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
                            long jG = he2Var.g(EventParam.EPARAM_STREAM_ID);
                            participantIdentifierDeserialize2.getClass();
                            EventParam eventParam2 = EventParam.EPARAM_STREAM_REQUIRED_FEATURES;
                            eventParam2.getClass();
                            Long l = (Long) he2Var.i(eventParam2);
                            long jLongValue = l != null ? l.longValue() : 0L;
                            ye4.a("AudioManager", "handle new audio stream: " + jG);
                            int i4 = vy.b[streamTypeSwigToEnum2.ordinal()];
                            if (i4 == 1) {
                                Settings settings2 = wyVar.a;
                                ca8 ca8Var = ca8.P_REMOTEAUDIO_RECEIVE_ENABLED;
                                settings2.getClass();
                                if (!Settings.a(gv6.USER, ca8Var)) {
                                    ye4.a("AudioManager", "Audio control stream not registered: Remote audio disabled by user.");
                                    wyVar.t = false;
                                    if (wyVar.p && (i2 = wyVar.f2460o) != 0) {
                                        wyVar.p = false;
                                        ((a2) ec3Var3).r.c(i2, false);
                                    }
                                }
                                ye4.a("AudioManager", "Remote audio control stream registered: " + jG + " from: " + participantIdentifierDeserialize2);
                                if (wyVar.f2460o != 0) {
                                    wyVar.f2460o = 0;
                                    wyVar.p = false;
                                    wyVar.m = 0;
                                    wyVar.n = false;
                                }
                                if ((StreamFeatures_Getters.GetOwnSupportedStreamFeatures(streamTypeSwigToEnum2) & jLongValue) != jLongValue) {
                                    ye4.c("AudioManager", "?! requested stream features not supported - please update App ?!");
                                    break;
                                } else {
                                    int i5 = (int) jG;
                                    wyVar.f2460o = i5;
                                    wyVar.q = participantIdentifierDeserialize2;
                                    boolean z = wyVar.t;
                                    if (z != wyVar.p && i5 != 0) {
                                        wyVar.p = z;
                                        ((a2) ec3Var3).r.c(i5, z);
                                        break;
                                    }
                                }
                            } else if (i4 == 2) {
                                ye4.a("AudioManager", "Remote audio data stream registered: " + jG + " from: " + participantIdentifierDeserialize2);
                                if ((StreamFeatures_Getters.GetOwnSupportedStreamFeatures(streamTypeSwigToEnum2) & jLongValue) != jLongValue) {
                                    ye4.c("AudioManager", "?! requested stream features not supported - please update App ?!");
                                } else {
                                    wyVar.m = (int) jG;
                                    wyVar.m();
                                }
                                break;
                            }
                        }
                        break;
                    case 4:
                        eventType.getClass();
                        he2Var.getClass();
                        StreamType streamTypeSwigToEnum3 = StreamType.swigToEnum(he2Var.g(EventParam.EPARAM_STREAM_TYPE));
                        int i6 = streamTypeSwigToEnum3 == null ? -1 : vy.b[streamTypeSwigToEnum3.ordinal()];
                        if (i6 == 2) {
                            EventParam eventParam3 = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam3.getClass();
                            Boolean bool2 = (Boolean) he2Var.i(eventParam3);
                            if (!(bool2 != null ? bool2.booleanValue() : false)) {
                                ye4.a("AudioManager", "handle close audio stream: " + he2Var.g(EventParam.EPARAM_STREAM_ID));
                                i = streamTypeSwigToEnum3 != null ? vy.b[streamTypeSwigToEnum3.ordinal()] : -1;
                                if (i == 1) {
                                    wyVar.f2460o = 0;
                                    wyVar.p = false;
                                    wyVar.m = 0;
                                    wyVar.n = false;
                                } else if (i == 2 && wyVar.b(2L) != null) {
                                    wyVar.d(false);
                                    wyVar.n = false;
                                    wyVar.m = 0;
                                }
                            }
                            break;
                        } else if (i6 == 3) {
                            EventParam eventParam4 = EventParam.EPARAM_STREAM_ENABLE;
                            eventParam4.getClass();
                            Boolean bool3 = (Boolean) he2Var.i(eventParam4);
                            if (bool3 != null ? bool3.booleanValue() : false) {
                                wyVar.h(true);
                            }
                            break;
                        }
                        break;
                    case 5:
                        eventType.getClass();
                        he2Var.getClass();
                        sy syVar2 = wyVar.h;
                        sy syVar3 = sy.p;
                        if (syVar2 != syVar3 && wyVar.n) {
                            wyVar.d(true);
                        } else if (syVar2 == syVar3) {
                            wyVar.e(false);
                        }
                        break;
                    case 6:
                        eventType.getClass();
                        he2Var.getClass();
                        wyVar.d(false);
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        bu7.MAIN.a(new io.sentry.b5((Object) wyVar, (byte) 27));
                        break;
                }
            }
        };
        this.G = r7;
        ye4.a("AudioManager", "create");
        i(pyVar);
        this.x = eventHub;
        eventHub.c(EventType.EVENT_MEETING_NEW_PARTICIPANT, r0);
        eventHub.c(EventType.EVENT_MEETING_REMOVED_PARTICIPANT, r1);
        eventHub.c(EventType.EVENT_STREAM_OUT_SUBSCRIBED, r2);
        eventHub.c(EventType.EVENT_STREAM_IN_SUBSCRIBED, r4);
        eventHub.c(EventType.EVENT_STREAM_IN_REGISTERED, r3);
        eventHub.c(EventType.EVENT_SESSION_RESUME, r5);
        eventHub.c(EventType.EVENT_SESSION_PAUSE, r6);
        eventHub.c(EventType.EVENT_SESSION_SHUTDOWN, r7);
        this.w = ec3Var;
        this.y = context;
        pg5 pg5Var = ((a2) ec3Var).r;
        TParticipantIdentifierVector tParticipantIdentifierVectorGetParticipantIDs = pg5Var.a.GetParticipantIDs();
        long size = tParticipantIdentifierVectorGetParticipantIDs.size();
        ArrayList<ParticipantIdentifier> arrayList = new ArrayList((int) size);
        for (long j = 0; j < size; j++) {
            ParticipantIdentifier participantIdentifier = tParticipantIdentifierVectorGetParticipantIDs.get((int) j);
            participantIdentifier.getClass();
            arrayList.add(participantIdentifier);
        }
        for (ParticipantIdentifier participantIdentifier2 : arrayList) {
            if (!im3.n(participantIdentifier2, pg5Var.b())) {
                this.k.put(Long.valueOf(participantIdentifier2.toInt64()), new bz());
            }
        }
        this.y.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, this.i);
    }

    public final z67 a(long j, xy xyVar) {
        z67 z67Var;
        NativeAudioInterface nativeAudioInterface = this.b;
        if (nativeAudioInterface == null) {
            ye4.c("AudioManager", "createAudioSource: audio interface is null");
            return null;
        }
        if (xyVar instanceof az) {
            z67Var = new z67(j, xyVar);
            az azVar = (az) xyVar;
            boolean zCreateAudioSourceSpeex = xyVar.a;
            if (zCreateAudioSourceSpeex) {
                zCreateAudioSourceSpeex = nativeAudioInterface.createAudioSourceSpeex(j, xyVar.b, xyVar.c, azVar.e, 0, azVar.f, azVar.g, azVar.h, azVar.i, azVar.j, azVar.k);
            }
            if (!zCreateAudioSourceSpeex) {
                ye4.c("SourceSpeex", "create valid speex source failed");
            }
        } else if (xyVar instanceof zy) {
            z67Var = new z67(j, xyVar);
            zy zyVar = (zy) xyVar;
            boolean zCreateAudioSourceOpus = xyVar.a;
            if (zCreateAudioSourceOpus) {
                zCreateAudioSourceOpus = nativeAudioInterface.createAudioSourceOpus(j, xyVar.b, xyVar.c, xyVar.d, zyVar.f, zyVar.e);
            }
            if (!zCreateAudioSourceOpus) {
                ye4.c("SourceCelt", "create valid speex source failed");
            }
        } else if (xyVar instanceof yy) {
            z67Var = new z67(j, xyVar);
            boolean zCreateAudioSourceMixed = xyVar.a;
            if (zCreateAudioSourceMixed) {
                zCreateAudioSourceMixed = nativeAudioInterface.createAudioSourceMixed(j, xyVar.b, xyVar.c);
            }
            if (!zCreateAudioSourceMixed) {
                ye4.c("SourceMixed", "create valid mixed source failed");
            }
        } else {
            z67Var = new z67(j, xyVar);
            boolean zCreateAudioSourcePCM = xyVar.a;
            if (zCreateAudioSourcePCM) {
                zCreateAudioSourcePCM = nativeAudioInterface.createAudioSourcePCM(j, xyVar.b, xyVar.c);
            } else {
                ye4.c("SourcePCM", "invalid params for pcm source - " + xyVar);
            }
            if (!zCreateAudioSourcePCM) {
                ye4.c("SourcePCM", "create valid pcm source failed");
            }
        }
        this.j.put(Long.valueOf(j), z67Var);
        return z67Var;
    }

    public final z67 b(long j) {
        return (z67) this.j.get(Long.valueOf(j));
    }

    public final void c() {
        if (this.b == null) {
            try {
                this.b = new NativeAudioInterface(new ny(this), new ny(this));
            } catch (LinkageError unused) {
                ye4.c("AudioManager", "NativeAudioInterface failed to load native lib!");
            }
        }
    }

    public final void d(boolean z) {
        if (this.b != null) {
            sy syVar = sy.f2065o;
            sy syVar2 = sy.p;
            ye4 ye4Var = ye4.a;
            sy syVar3 = this.h;
            if (z && syVar3 == syVar2) {
                ye4Var.g("AudioManager", "play internal: already playing");
            } else if (!z && syVar3 == syVar) {
                ye4Var.g("AudioManager", "play internal: already paused");
            }
            NativeAudioInterface nativeAudioInterface = this.b;
            if (nativeAudioInterface != null ? nativeAudioInterface.playRemoteAudio(z) : false) {
                sy syVar4 = this.g;
                if (z) {
                    if (syVar2 != syVar4) {
                        ye4.a("AudioManager", "new internal ra playback state: " + syVar2);
                        this.g = syVar2;
                        return;
                    }
                    return;
                }
                if (syVar != syVar4) {
                    ye4.a("AudioManager", "new internal ra playback state: " + syVar);
                    this.g = syVar;
                }
            }
        }
    }

    public final boolean e(boolean z) {
        NativeAudioInterface nativeAudioInterface = this.b;
        boolean zPlayAudio = false;
        if (nativeAudioInterface != null) {
            sy syVar = this.g;
            sy syVar2 = sy.p;
            sy syVar3 = sy.f2065o;
            if ((z && syVar == syVar3) || ((z && syVar == sy.m) || (!z && syVar == syVar2))) {
                zPlayAudio = nativeAudioInterface.playAudio(z);
            }
            if (zPlayAudio) {
                if (z) {
                    k(syVar2);
                } else {
                    k(syVar3);
                }
                h(z);
                return zPlayAudio;
            }
            k(sy.n);
            l(qy.n);
            ye4.c("AudioManager", "playAudio set failed");
        }
        return zPlayAudio;
    }

    public final void f(boolean z) {
        NativeAudioInterface nativeAudioInterface = this.b;
        if (nativeAudioInterface != null) {
            if (nativeAudioInterface.recordAudio(z)) {
                if (z) {
                    j(ty.p);
                    return;
                } else {
                    j(ty.f2154o);
                    return;
                }
            }
            j(ty.n);
            ry ryVar = this.e;
            ry ryVar2 = ry.n;
            if (ryVar2 != ryVar) {
                ye4.a("AudioManager", "new extrenal record state: " + ryVar2);
                this.e = ryVar2;
            }
            ye4.a.g("AudioManager", "recordAudio set failed");
        }
    }

    public final void g(long j) {
        NativeAudioInterface nativeAudioInterface;
        if (b(j) == null) {
            ye4.c("AudioManager", "removeAudioSourceVOIP: source not found: " + j);
            return;
        }
        NativeAudioInterface nativeAudioInterface2 = this.b;
        if (nativeAudioInterface2 == null) {
            ye4.c("AudioManager", "removeAudioSourceVOIP: audio interface is null");
            return;
        }
        if (!nativeAudioInterface2.destroyAudioSource(j)) {
            ye4.c("AudioManager", "removeAudioSourceVOIP: destroy native source failed");
        }
        this.j.remove(Long.valueOf(j));
        if (j == 2 || (nativeAudioInterface = this.b) == null) {
            return;
        }
        nativeAudioInterface.removeAudioSourceFromMixedSource(1L, j);
    }

    public final void h(boolean z) {
        bk7 bk7Var = bk7.TVCmdMMAdjust;
        KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
        ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
        ak7VarN.b(jj7.TVCmdMMAdjustAudioActive, z ? (byte) 1 : (byte) 0);
        ak7VarN.b(jj7.TVCmdMMAdjustVideoActive, (byte) 0);
        ((a2) this.w).m.e(ak7VarN);
    }

    public final void i(py pyVar) {
        if (pyVar != this.c) {
            ye4.a("AudioManager", "new audio state: " + pyVar);
            this.c = pyVar;
        }
    }

    public final void j(ty tyVar) {
        if (tyVar != this.d) {
            ye4.a("AudioManager", "new internal record state: " + tyVar);
            this.d = tyVar;
        }
    }

    public final void k(sy syVar) {
        if (syVar != this.g) {
            ye4.a("AudioManager", "new internal playback state: " + syVar);
            this.g = syVar;
        }
    }

    public final void l(qy qyVar) {
        if (qyVar != this.f) {
            ye4.a("AudioManager", "new external playback state: " + qyVar);
            this.f = qyVar;
        }
    }

    public final synchronized void m() {
        try {
            if (b(2L) != null) {
                boolean z = this.t;
                if ((z && !this.u) == this.n || !this.r || this.m == 0) {
                    ye4.c("AudioManager", "updateRemoteAudioDataStreamSubscription: skipping state change");
                } else {
                    boolean z2 = z && !this.u;
                    this.n = z2;
                    ye4.a("AudioManager", "subscribe ra: " + z2);
                    ((a2) this.w).r.c(this.m, z2);
                    if (z2) {
                        this.v = true;
                    } else {
                        d(false);
                    }
                }
            } else {
                ye4.c("AudioManager", "updateRemoteAudioDataStreamSubscription: src not found");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
