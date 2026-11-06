package o;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import com.teamviewer.commonresourcelib.swig.FeedbackViewModelFactory;
import com.teamviewer.commonresourcelib.swig.IFeedbackViewModel;
import com.teamviewer.commonresourcelib.swig.IRatingViewModel;
import com.teamviewer.commonresourcelib.swig.RatingViewModelFactory;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModel;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvaccount.IAccountAndroid;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uf2 implements Function0 {
    public final /* synthetic */ byte m;

    public /* synthetic */ uf2(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        Class<?> returnType;
        String str;
        cg3 cg3Var;
        cg3 cg3Var2;
        byte b = 26;
        Object mi2Var = null;
        switch (this.m) {
            case 0:
                return new tf2(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 536870911);
            case 1:
                if (xo1.a != null) {
                    String str2 = "Undefined";
                    if (n37.b) {
                        str = "QuickSupport";
                    } else if (n37.c) {
                        str = "Host";
                    } else if (n37.a) {
                        str = "RemoteControl";
                    } else if (n37.d) {
                        str = "Pilot";
                    } else {
                        str = n37.e ? "PilotLite" : "Undefined";
                    }
                    String strConcat = "TV".concat(str);
                    if (n37.b) {
                        str2 = "QuickSupport";
                    } else if (n37.c) {
                        str2 = "Host";
                    } else if (n37.a) {
                        str2 = "RemoteControl";
                    } else if (n37.d) {
                        str2 = "Pilot";
                    } else if (n37.e) {
                        str2 = "PilotLite";
                    }
                    IFeedbackViewModel iFeedbackViewModelGetFeedbackViewModel = FeedbackViewModelFactory.GetFeedbackViewModel(strConcat, str2.concat(" Android"));
                    iFeedbackViewModelGetFeedbackViewModel.getClass();
                    IRatingViewModel iRatingViewModelGetRatingViewModel = RatingViewModelFactory.GetRatingViewModel();
                    iRatingViewModelGetRatingViewModel.getClass();
                    mi2Var = new mi2(iFeedbackViewModelGetFeedbackViewModel, iRatingViewModelGetRatingViewModel);
                }
                mi2Var.getClass();
                return mi2Var;
            case 2:
                return h57.p(Boolean.FALSE);
            case 3:
                return f88.a;
            case 4:
                return h57.p(Boolean.FALSE);
            case 5:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 6:
                try {
                    Method method = (Method) jv2.p.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 7:
                return f88.a;
            case 8:
                return h57.p(Boolean.FALSE);
            case ep1.b /* 9 */:
                return f88.a;
            case ep1.c /* 10 */:
                return f88.a;
            case 11:
                return f88.a;
            case ep1.d /* 12 */:
                return f88.a;
            case 13:
                c36 c36Var = zu1.c;
                if (c36Var != null) {
                    return new f33(c36Var.e());
                }
                hk0.g("Required value was null.");
                return null;
            case 14:
                return h57.p(y33.m);
            case 15:
                if (zu1.c != null) {
                    return new e43(0);
                }
                hk0.g("Required value was null.");
                return null;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 17:
                tk1 tk1Var = g22.a;
                return ok4.a.r;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return (e46) wa8.a.getValue();
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return (vi) re3.a.getValue();
            case 20:
                return ds1.q(1, 1, 0, 28);
            case 21:
                return new ve3("emptyImageVector", 1.0f, 1.0f, 1.0f, 1.0f, 0L, 0, false, 224).e();
            case 22:
                return new BitmapPainter((vi) re3.a.getValue());
            case 23:
                return (ud5) re3.c.getValue();
            case 24:
                return (we3) re3.b.getValue();
            case 25:
                c36 c36Var2 = zu1.c;
                if (c36Var2 != null) {
                    BackendContainerAndroid backendContainerAndroidGetInstance = BackendContainerAndroid.GetInstance();
                    IInAppPurchaseViewModel iInAppPurchaseViewModelD = et1.d();
                    iInAppPurchaseViewModelD.getClass();
                    RemoteControlApplication remoteControlApplication = c36Var2.a;
                    if (cg3.i != null) {
                        cg3Var = cg3.i;
                        cg3Var.getClass();
                    } else {
                        synchronized (cg3.class) {
                            try {
                                if (cg3.i == null) {
                                    cg3.i = new cg3(remoteControlApplication);
                                }
                                cg3Var = cg3.i;
                                cg3Var.getClass();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    IAccountAndroid iAccountAndroidGetAccount = backendContainerAndroidGetInstance.GetAccount();
                    iAccountAndroidGetAccount.getClass();
                    mi2Var = new jf3(iInAppPurchaseViewModelD, new yt2(cg3Var, iAccountAndroidGetAccount, new xz2(b)), EventHub.e.f(), c36Var2.b);
                } else {
                    hk0.g("Required value was null.");
                }
                return mi2Var;
            case 26:
                hr2 hr2Var = new hr2((byte) 12);
                hr2Var.n = "subs";
                return new zy5(hr2Var);
            case 27:
                return f88.a;
            case 28:
                c36 c36Var3 = zu1.c;
                if (c36Var3 != null) {
                    BackendContainerAndroid backendContainerAndroidGetInstance2 = BackendContainerAndroid.GetInstance();
                    IInAppPurchaseViewModel iInAppPurchaseViewModelD2 = et1.d();
                    iInAppPurchaseViewModelD2.getClass();
                    RemoteControlApplication remoteControlApplication2 = c36Var3.a;
                    if (cg3.i != null) {
                        cg3Var2 = cg3.i;
                        cg3Var2.getClass();
                    } else {
                        synchronized (cg3.class) {
                            try {
                                if (cg3.i == null) {
                                    cg3.i = new cg3(remoteControlApplication2);
                                }
                                cg3Var2 = cg3.i;
                                cg3Var2.getClass();
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    IAccountAndroid iAccountAndroidGetAccount2 = backendContainerAndroidGetInstance2.GetAccount();
                    iAccountAndroidGetAccount2.getClass();
                    mi2Var = new dg3(iInAppPurchaseViewModelD2, new yt2(cg3Var2, iAccountAndroidGetAccount2, new xz2(b)));
                } else {
                    hk0.g("Required value was null.");
                }
                return mi2Var;
            default:
                return new ow(fu.a, (byte) 0);
        }
    }
}
