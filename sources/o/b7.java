package o;

import androidx.lifecycle.Observer;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b7 implements Observer, qw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    public /* synthetic */ b7(Function1 function1, byte b) {
        this.m = b;
        this.n = function1;
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void a(Object obj) {
        byte b = this.m;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                function1.invoke(obj);
                break;
            case 1:
                function1.invoke(obj);
                break;
            case 2:
                function1.invoke(obj);
                break;
            case 3:
                function1.invoke(obj);
                break;
            case 4:
                function1.invoke(obj);
                break;
            case 5:
                function1.invoke(obj);
                break;
            case 6:
                function1.invoke(obj);
                break;
            case 7:
                function1.invoke(obj);
                break;
            case 8:
                function1.invoke(obj);
                break;
            case ep1.b /* 9 */:
                function1.invoke(obj);
                break;
            case ep1.c /* 10 */:
                function1.invoke(obj);
                break;
            case 11:
                function1.invoke(obj);
                break;
            case ep1.d /* 12 */:
                function1.invoke(obj);
                break;
            case 13:
                function1.invoke(obj);
                break;
            case 14:
                function1.invoke(obj);
                break;
            case 15:
                function1.invoke(obj);
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                function1.invoke(obj);
                break;
            case 17:
                function1.invoke(obj);
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                function1.invoke(obj);
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                function1.invoke(obj);
                break;
            case 20:
                function1.invoke(obj);
                break;
            case 21:
                function1.invoke(obj);
                break;
            case 22:
                function1.invoke(obj);
                break;
            case 23:
                function1.invoke(obj);
                break;
            case 24:
                function1.invoke(obj);
                break;
            case 25:
                function1.invoke(obj);
                break;
            case 26:
                function1.invoke(obj);
                break;
            case 27:
                function1.invoke(obj);
                break;
            default:
                function1.invoke(obj);
                break;
        }
    }

    @Override // o.qw2
    public final pw2 b() {
        byte b = this.m;
        return this.n;
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
            case 17:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 20:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 21:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 22:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 23:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 24:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 25:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 26:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            case 27:
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
            case 17:
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
        }
        return b().hashCode();
    }
}
