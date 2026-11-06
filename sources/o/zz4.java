package o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.Size;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataSize;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenInformationViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IChangeResolutionViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IChangeResolutionViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.ListOfResolutions;
import com.teamviewer.remotecontrolviewmodellib.swig.Resolution;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zz4 extends oe8 implements bd3 {
    public final IChangeResolutionViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IRemoteScreenInformationViewModel f2742o;
    public final Resources p;
    public final j93 q;
    public final SharedPreferences r;
    public final nw4 s;
    public final p t;

    public zz4(IChangeResolutionViewModel iChangeResolutionViewModel, IRemoteScreenInformationViewModel iRemoteScreenInformationViewModel, Resources resources, j93 j93Var, SharedPreferences sharedPreferences) {
        j93Var.getClass();
        sharedPreferences.getClass();
        this.n = iChangeResolutionViewModel;
        this.f2742o = iRemoteScreenInformationViewModel;
        this.p = resources;
        this.q = j93Var;
        this.r = sharedPreferences;
        this.s = new nw4();
        p pVar = new p(this, (byte) 11);
        this.t = pVar;
        iChangeResolutionViewModel.b().observeForever(pVar);
    }

    public static void V0(ArrayList arrayList, Size size, String str, o72 o72Var) {
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            yz4 yz4Var = (yz4) next;
            if (yz4Var.b == size.getWidth() && yz4Var.c == size.getHeight()) {
                break;
            }
        }
        yz4 yz4Var2 = (yz4) next;
        if (yz4Var2 != null) {
            arrayList.remove(yz4Var2);
            arrayList.add(0, new yz4(yz4Var2, str, o72Var));
        }
    }

    public static void W0(ArrayList arrayList, Resolution resolution, String str) {
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            yz4 yz4Var = (yz4) next;
            if (yz4Var.b == IChangeResolutionViewModelSWIGJNI.Resolution_width_get(resolution.a, resolution) && yz4Var.c == IChangeResolutionViewModelSWIGJNI.Resolution_height_get(resolution.a, resolution)) {
                break;
            }
        }
        yz4 yz4Var2 = (yz4) next;
        if (yz4Var2 != null) {
            arrayList.remove(yz4Var2);
            arrayList.add(0, new yz4(yz4Var2, str, o72.f1638o));
        }
    }

    @Override // o.oe8
    public final void U0() {
        IChangeResolutionViewModel iChangeResolutionViewModel = this.n;
        iChangeResolutionViewModel.b().removeObserver(this.t);
        iChangeResolutionViewModel.c();
        this.f2742o.b();
    }

    @Override // o.bd3
    public final void c0(Object obj) {
        if (obj instanceof yz4) {
            yz4 yz4Var = (yz4) obj;
            int i = yz4Var.a;
            IChangeResolutionViewModel iChangeResolutionViewModel = this.n;
            IChangeResolutionViewModelSWIGJNI.IChangeResolutionViewModel_SelectResolution(iChangeResolutionViewModel.a, iChangeResolutionViewModel, i);
            SharedPreferences sharedPreferences = this.r;
            int i2 = sharedPreferences.getInt("INPUT_METHOD_INT", 0);
            n72.n.getClass();
            if (cr.f(i2) == n72.Touch) {
                o72 o72Var = yz4Var.e;
                ye4.a("TVChangeResolutionPreferenceViewModel", "New preferred resolution: " + o72Var.name());
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.getClass();
                editorEdit.putString("PREFERRED_RESOLUTION", o72Var.name());
                editorEdit.apply();
            }
        }
    }

    @Override // o.bd3
    public final fc4 k0() {
        Resolution resolution;
        ListOfResolutions<Resolution> listOfResolutions = (ListOfResolutions) this.n.a().getValue();
        if (listOfResolutions == null || (resolution = (Resolution) this.n.b().getValue()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(mv0.Z(listOfResolutions, 10));
        for (Resolution resolution2 : listOfResolutions) {
            resolution2.getClass();
            arrayList2.add(new yz4(resolution2));
        }
        arrayList.addAll(arrayList2);
        pv0.b0(arrayList, new px0(new Function1[]{new at4((byte) 4), new at4((byte) 5)}));
        IChangeResolutionViewModel iChangeResolutionViewModel = this.n;
        Size size = (Size) NativeLiveDataSize.newInstance(IChangeResolutionViewModelSWIGJNI.IChangeResolutionViewModel_OriginalResolution(iChangeResolutionViewModel.a, iChangeResolutionViewModel), false).getValue();
        j93 j93Var = this.q;
        Float f = (Float) this.f2742o.a().getValue();
        float fFloatValue = f != null ? f.floatValue() : 1.0f;
        j93Var.getClass();
        Point pointT = j93Var.T();
        int i = pointT.x;
        int i2 = pointT.y;
        Resolution resolutionK = hm3.k(listOfResolutions, i, i2, fFloatValue, true);
        if (resolutionK == null) {
            resolutionK = hm3.k(listOfResolutions, i, i2, fFloatValue, false);
        }
        if (size != null) {
            if (resolutionK != null && size.getWidth() == IChangeResolutionViewModelSWIGJNI.Resolution_width_get(resolutionK.a, resolutionK) && size.getHeight() == IChangeResolutionViewModelSWIGJNI.Resolution_height_get(resolutionK.a, resolutionK)) {
                V0(arrayList, size, String.format("%s & %s", Arrays.copyOf(new Object[]{this.p.getString(R.string.tv_options_PreferredResolutionDontChange), this.p.getString(R.string.tv_options_PreferredResolutionBestFit)}, 2)), o72.f1638o);
            } else {
                if (resolutionK != null) {
                    String string = this.p.getString(R.string.tv_options_PreferredResolutionBestFit);
                    string.getClass();
                    W0(arrayList, resolutionK, string);
                }
                String string2 = this.p.getString(R.string.tv_options_PreferredResolutionDontChange);
                string2.getClass();
                V0(arrayList, size, string2, o72.n);
            }
        } else if (resolutionK != null) {
            String string3 = this.p.getString(R.string.tv_options_PreferredResolutionBestFit);
            string3.getClass();
            W0(arrayList, resolutionK, string3);
        }
        if (nv1.d != null) {
            return yi5.d(new yz4(resolution), arrayList);
        }
        im3.e0("dialogFactory");
        throw null;
    }

    @Override // o.bd3
    public final nw4 n() {
        return this.s;
    }
}
