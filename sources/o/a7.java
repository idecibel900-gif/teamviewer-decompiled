package o;

import androidx.lifecycle.Observer;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a7 implements Observer, qw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    public /* synthetic */ a7(Function1 function1, byte b) {
        this.m = b;
        this.n = function1;
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void a(Object obj) throws JSONException {
        byte b = this.m;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                ((t) function1).invoke(obj);
                break;
            case 1:
                ((q0) function1).invoke(obj);
                break;
            case 2:
                ((q0) function1).invoke(obj);
                break;
            case 3:
                ((q0) function1).invoke(obj);
                break;
            case 4:
                ((m5) function1).invoke(obj);
                break;
            case 5:
                ((fj3) function1).invoke(obj);
                break;
            case 6:
                ((fj3) function1).invoke(obj);
                break;
            case 7:
                ((t) function1).invoke(obj);
                break;
            case 8:
                ((h16) function1).invoke(obj);
                break;
            case ep1.b /* 9 */:
                ((y46) function1).invoke(obj);
                break;
            case ep1.c /* 10 */:
                ((h16) function1).invoke(obj);
                break;
            case 11:
                ((y46) function1).invoke(obj);
                break;
            case ep1.d /* 12 */:
                ((y46) function1).invoke(obj);
                break;
            case 13:
                ((hl7) function1).invoke(obj);
                break;
            case 14:
                ((hl7) function1).invoke(obj);
                break;
            case 15:
                ((ll7) function1).invoke(obj);
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((py5) function1).invoke(obj);
                break;
            default:
                ((sf8) function1).invoke(obj);
                break;
        }
    }

    @Override // o.qw2
    public final pw2 b() {
        byte b = this.m;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                return (t) function1;
            case 1:
                return (q0) function1;
            case 2:
                return (q0) function1;
            case 3:
                return (q0) function1;
            case 4:
                return (m5) function1;
            case 5:
                return (fj3) function1;
            case 6:
                return (fj3) function1;
            case 7:
                return (t) function1;
            case 8:
                return (h16) function1;
            case ep1.b /* 9 */:
                return (y46) function1;
            case ep1.c /* 10 */:
                return (h16) function1;
            case 11:
                return (y46) function1;
            case ep1.d /* 12 */:
                return (y46) function1;
            case 13:
                return (hl7) function1;
            case 14:
                return (hl7) function1;
            case 15:
                return (ll7) function1;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return (py5) function1;
            default:
                return (sf8) function1;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.m) {
            case 0:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 1:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 2:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 3:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 4:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 5:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 6:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 7:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 8:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case ep1.b /* 9 */:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case ep1.c /* 10 */:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 11:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case ep1.d /* 12 */:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 13:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 14:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 15:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            default:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.m) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case ep1.b /* 9 */:
                break;
            case ep1.c /* 10 */:
                break;
            case 11:
                break;
            case ep1.d /* 12 */:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                break;
        }
        return b().hashCode();
    }
}
