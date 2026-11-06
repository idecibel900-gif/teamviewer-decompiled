package o;

import android.view.Choreographer;
import android.webkit.CookieManager;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;

/* JADX INFO: loaded from: classes.dex */
public final class l5 extends og7 implements hw2 {
    public final /* synthetic */ byte m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5(int i, hc1 hc1Var, byte b) {
        super(i, hc1Var);
        this.m = b;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new l5(2, hc1Var, (byte) 0);
            case 1:
                return new l5(2, hc1Var, (byte) 1);
            case 2:
                return new l5(2, hc1Var, (byte) 2);
            case 3:
                return new l5(2, hc1Var, (byte) 3);
            case 4:
                return new l5(2, hc1Var, (byte) 4);
            case 5:
                return new l5(2, hc1Var, (byte) 5);
            case 6:
                return new l5(2, hc1Var, (byte) 6);
            case 7:
                return new l5(2, hc1Var, (byte) 7);
            case 8:
                return new l5(2, hc1Var, (byte) 8);
            case ep1.b /* 9 */:
                return new l5(2, hc1Var, (byte) 9);
            case ep1.c /* 10 */:
                return new l5(2, hc1Var, (byte) 10);
            case 11:
                return new l5(2, hc1Var, (byte) 11);
            case ep1.d /* 12 */:
                return new l5(2, hc1Var, (byte) 12);
            case 13:
                return new l5(2, hc1Var, (byte) 13);
            case 14:
                return new l5(2, hc1Var, (byte) 14);
            case 15:
                return new l5(2, hc1Var, (byte) 15);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return new l5(2, hc1Var, (byte) 16);
            case 17:
                return new l5(2, hc1Var, (byte) 17);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return new l5(2, hc1Var, (byte) 18);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return new l5(2, hc1Var, (byte) 19);
            case 20:
                return new l5(2, hc1Var, (byte) 20);
            case 21:
                return new l5(2, hc1Var, (byte) 21);
            default:
                return new l5(2, hc1Var, (byte) 22);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 1:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 2:
                return ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 3:
                ((l5) create((go2) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 4:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 5:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 6:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 7:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 8:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case ep1.b /* 9 */:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case ep1.c /* 10 */:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 11:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case ep1.d /* 12 */:
                ((l5) create((dk6) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 13:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 14:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 15:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 17:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 20:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 21:
                ((l5) create((ho2) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            default:
                ((l5) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(q31.B);
                return f88Var;
            case 1:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(u5.q);
                return f88Var;
            case 2:
                ct1.a0(obj);
                return Choreographer.getInstance();
            case 3:
                ct1.a0(obj);
                return f88Var;
            case 4:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                ga7.a(ra1.D);
                return f88Var;
            case 5:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler4 = ga7.a;
                ga7.a(ra1.x);
                return f88Var;
            case 6:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler5 = ga7.a;
                ga7.a(ra1.r);
                return f88Var;
            case 7:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler6 = ga7.a;
                ga7.a(g02.t);
                return f88Var;
            case 8:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler7 = ga7.a;
                ga7.a(g02.F);
                return f88Var;
            case ep1.b /* 9 */:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler8 = ga7.a;
                ga7.a(ra1.G);
                return f88Var;
            case ep1.c /* 10 */:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler9 = ga7.a;
                ga7.a(g02.r);
                return f88Var;
            case 11:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler10 = ga7.a;
                ga7.a(f43.s);
                return f88Var;
            case ep1.d /* 12 */:
                ct1.a0(obj);
                return f88Var;
            case 13:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler11 = ga7.a;
                ga7.a(px5.y);
                return f88Var;
            case 14:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler12 = ga7.a;
                ga7.a(f43.y);
                return f88Var;
            case 15:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler13 = ga7.a;
                ga7.a(sr6.OnServiceQueueScreenOpen);
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler14 = ga7.a;
                ga7.a(kt6.C);
                return f88Var;
            case 17:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler15 = ga7.a;
                ga7.a(q31.D);
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler16 = ga7.a;
                ga7.a(kt6.q);
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler17 = ga7.a;
                ga7.a(q31.D);
                return f88Var;
            case 20:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler18 = ga7.a;
                ga7.a(ew6.ScreenOpened);
                return f88Var;
            case 21:
                ct1.a0(obj);
                return f88Var;
            default:
                ct1.a0(obj);
                CookieManager.getInstance().flush();
                return f88Var;
        }
    }
}
