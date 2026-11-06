package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ys3 {
    public final /* synthetic */ byte a;

    static {
        int i = dg2.b;
    }

    public /* synthetic */ ys3(byte b) {
        this.a = b;
    }

    public final t1 a(ByteArrayInputStream byteArrayInputStream, dg2 dg2Var) throws rm3 {
        t1 t1Var;
        try {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                t1Var = null;
            } else {
                if ((i & 128) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 < 32) {
                            int i3 = byteArrayInputStream.read();
                            if (i3 == -1) {
                                throw rm3.a();
                            }
                            i |= (i3 & 127) << i2;
                            if ((i3 & 128) == 0) {
                                break;
                            }
                            i2 += 7;
                        } else {
                            while (true) {
                                if (i2 >= 64) {
                                    throw new rm3("CodedInputStream encountered a malformed varint.");
                                }
                                int i4 = byteArrayInputStream.read();
                                if (i4 == -1) {
                                    throw rm3.a();
                                }
                                if ((i4 & 128) == 0) {
                                    break;
                                }
                                i2 += 7;
                            }
                        }
                    }
                }
                vu0 vu0Var = new vu0(new r1(byteArrayInputStream, i));
                t1Var = (t1) b(vu0Var, dg2Var);
                try {
                    vu0Var.a(0);
                } catch (rm3 e) {
                    e.m = t1Var;
                    throw e;
                }
            }
            if (t1Var == null || t1Var.a()) {
                return t1Var;
            }
            rm3 rm3Var = new rm3(new z78().getMessage());
            rm3Var.m = t1Var;
            throw rm3Var;
        } catch (IOException e2) {
            throw new rm3(e2.getMessage());
        }
    }

    public final Object b(vu0 vu0Var, dg2 dg2Var) {
        switch (this.a) {
            case 0:
                return new at3(vu0Var);
            case 1:
                return new bt3(vu0Var);
            case 2:
                return new dt3(vu0Var, dg2Var);
            case 3:
                return new it3(vu0Var, dg2Var);
            case 4:
                return new ht3(vu0Var);
            case 5:
                return new qu5(vu0Var, dg2Var);
            case 6:
                return new ou5(vu0Var, dg2Var);
            case 7:
                return new nu5(vu0Var, dg2Var);
            case 8:
                return new tu5(vu0Var, dg2Var);
            case ep1.b /* 9 */:
                return new vu5(vu0Var, dg2Var);
            case ep1.c /* 10 */:
                return new xu5(vu0Var, dg2Var);
            case 11:
                return new bv5(vu0Var, dg2Var);
            case ep1.d /* 12 */:
                return new dv5(vu0Var, dg2Var);
            case 13:
                return new gv5(vu0Var, dg2Var);
            case 14:
                return new iv5(vu0Var, dg2Var);
            case 15:
                return new mv5(vu0Var, dg2Var);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return new ov5(vu0Var, dg2Var);
            case 17:
                return new qv5(vu0Var, dg2Var);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return new uv5(vu0Var, dg2Var);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return new tv5(vu0Var);
            case 20:
                return new vv5(vu0Var);
            case 21:
                return new aw5(vu0Var, dg2Var);
            case 22:
                return new yv5(vu0Var, dg2Var);
            case 23:
                return new cw5(vu0Var, dg2Var);
            case 24:
                return new fw5(vu0Var, dg2Var);
            case 25:
                return new gw5(vu0Var, dg2Var);
            case 26:
                return new iw5(vu0Var, dg2Var);
            case 27:
                return new mw5(vu0Var);
            default:
                return new nw5(vu0Var, dg2Var);
        }
    }
}
