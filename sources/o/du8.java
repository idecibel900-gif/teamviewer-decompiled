package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class du8 {
    public static final du8 b = new du8(0);
    public static final du8 c = new du8(1);
    public static final du8 d = new du8(2);
    public static final du8 e = new du8(3);
    public static final du8 f = new du8(4);
    public static final du8 g = new du8(5);
    public static final du8 h = new du8(6);
    public static final du8 i = new du8(7);
    public static final du8 j = new du8(8);
    public final /* synthetic */ byte a;

    public /* synthetic */ du8(byte b2) {
        this.a = b2;
    }

    public final boolean a(int i2) {
        mw8 mw8Var;
        switch (this.a) {
            case 0:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case ep1.b /* 9 */:
                    case ep1.c /* 10 */:
                    case 11:
                    case ep1.d /* 12 */:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        switch (i2) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                                break;
                            default:
                                return false;
                        }
                        break;
                }
                return true;
            case 2:
                return to7.a(i2) != 0;
            case 3:
                if (i2 == 0) {
                    mw8Var = mw8.BROADCAST_ACTION_UNSPECIFIED;
                } else if (i2 == 1) {
                    mw8Var = mw8.PURCHASES_UPDATED_ACTION;
                } else if (i2 == 2) {
                    mw8Var = mw8.LOCAL_PURCHASES_UPDATED_ACTION;
                } else if (i2 == 3) {
                    mw8Var = mw8.ALTERNATIVE_BILLING_ACTION;
                } else if (i2 != 4) {
                    mw8Var = i2 != 5 ? null : mw8.PLAY_BILLING_ACTIVITY_CREATED_ACTION;
                } else {
                    mw8Var = mw8.IN_APP_BILLING_RESULT_UPDATE_ACTION;
                }
                return mw8Var != null;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 5:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case ep1.b /* 9 */:
                    case ep1.c /* 10 */:
                    case 11:
                    case ep1.d /* 12 */:
                    case 13:
                    case 17:
                    case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                    case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    case 20:
                    case 21:
                        return true;
                    case 14:
                    case 15:
                    case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    default:
                        return false;
                }
            case 6:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 7:
                return i2 == 0 || i2 == 1;
            default:
                return i2 == 0 || i2 == 1;
        }
    }
}
