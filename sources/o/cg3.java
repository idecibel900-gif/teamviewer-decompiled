package o;

import android.content.SharedPreferences;
import android.graphics.Point;
import androidx.lifecycle.Observer;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenInformationViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IChangeResolutionViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IChangeResolutionViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.ListOfResolutions;
import com.teamviewer.remotecontrolviewmodellib.swig.Resolution;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cg3 {
    public static volatile cg3 i;
    public final Object a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;
    public Object g;
    public final Object h;

    public cg3() {
        Boolean bool = Boolean.FALSE;
        this.a = h57.p(bool);
        this.b = new wf5(1.0f);
        this.c = h57.p(bool);
        this.d = new wf5(1.0f);
        this.e = h57.p(bool);
        this.f = h57.p(new d18(d18.b));
        this.g = h57.p(bool);
        this.h = h57.p(new rv0(rv0.g));
    }

    public void a(List list, float f) {
        IChangeResolutionViewModel iChangeResolutionViewModel = (IChangeResolutionViewModel) this.a;
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        if (sharedPreferences.getInt("INPUT_METHOD_INT", 0) == 1 && im3.n(sharedPreferences.getString("PREFERRED_RESOLUTION", "DontChange"), "BestFit") && list != null && !list.isEmpty() && ((Resolution) this.e) == null) {
            j93 j93Var = (j93) this.c;
            list.getClass();
            j93Var.getClass();
            Point pointT = j93Var.T();
            int i2 = pointT.x;
            int i3 = pointT.y;
            Resolution resolutionK = hm3.k(list, i2, i3, f, true);
            if (resolutionK == null) {
                resolutionK = hm3.k(list, i2, i3, f, false);
            }
            if (resolutionK == null || im3.n(iChangeResolutionViewModel.b().getValue(), resolutionK)) {
                return;
            }
            ye4.a("BestFitResolutionHandler", "Set best fit resolution to: " + IChangeResolutionViewModelSWIGJNI.Resolution_width_get(resolutionK.a, resolutionK) + "x" + IChangeResolutionViewModelSWIGJNI.Resolution_height_get(resolutionK.a, resolutionK));
            this.e = resolutionK;
            IChangeResolutionViewModelSWIGJNI.IChangeResolutionViewModel_SelectResolution(iChangeResolutionViewModel.a, iChangeResolutionViewModel, IChangeResolutionViewModelSWIGJNI.Resolution_id_get(resolutionK.a, resolutionK));
        }
    }

    public cg3(RemoteControlApplication remoteControlApplication) {
        this.a = remoteControlApplication;
        se7 se7VarA = g57.a();
        tk1 tk1Var = g22.a;
        this.b = hm3.c(xk0.G(se7VarA, ok4.a.r));
        this.f = au8.l(0, 7, null);
        this.h = new xk1((Object) this, (byte) 24);
    }

    public cg3(IChangeResolutionViewModel iChangeResolutionViewModel, IRemoteScreenInformationViewModel iRemoteScreenInformationViewModel, j93 j93Var, SharedPreferences sharedPreferences) {
        j93Var.getClass();
        sharedPreferences.getClass();
        this.a = iChangeResolutionViewModel;
        this.b = iRemoteScreenInformationViewModel;
        this.c = j93Var;
        this.d = sharedPreferences;
        final byte b = 0;
        Observer observer = new Observer(this) { // from class: o.r50
            public final /* synthetic */ cg3 n;

            {
                this.n = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // androidx.lifecycle.Observer
            public final void a(Object obj) {
                Float f;
                ListOfResolutions listOfResolutions;
                byte b2 = b;
                cg3 cg3Var = this.n;
                switch (b2) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        if (!list.isEmpty() && (f = (Float) ((IRemoteScreenInformationViewModel) cg3Var.b).a().getValue()) != null && Math.abs(f.floatValue()) <= Float.MAX_VALUE && f.floatValue() > 0.0f) {
                            cg3Var.a(list, f.floatValue());
                            break;
                        }
                        break;
                    case 1:
                        Resolution resolution = (Resolution) obj;
                        resolution.getClass();
                        if (resolution.equals((Resolution) cg3Var.e)) {
                            cg3Var.e = null;
                        }
                        break;
                    default:
                        float fFloatValue = ((Float) obj).floatValue();
                        if (Math.abs(fFloatValue) <= Float.MAX_VALUE && fFloatValue > 0.0f && (listOfResolutions = (ListOfResolutions) ((IChangeResolutionViewModel) cg3Var.a).a().getValue()) != null && !IChangeResolutionViewModelSWIGJNI.ListOfResolutions_isEmpty(listOfResolutions.m, listOfResolutions)) {
                            cg3Var.a(listOfResolutions, fFloatValue);
                            break;
                        }
                        break;
                }
            }
        };
        this.f = observer;
        final byte b2 = 1;
        Observer observer2 = new Observer(this) { // from class: o.r50
            public final /* synthetic */ cg3 n;

            {
                this.n = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // androidx.lifecycle.Observer
            public final void a(Object obj) {
                Float f;
                ListOfResolutions listOfResolutions;
                byte b3 = b2;
                cg3 cg3Var = this.n;
                switch (b3) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        if (!list.isEmpty() && (f = (Float) ((IRemoteScreenInformationViewModel) cg3Var.b).a().getValue()) != null && Math.abs(f.floatValue()) <= Float.MAX_VALUE && f.floatValue() > 0.0f) {
                            cg3Var.a(list, f.floatValue());
                            break;
                        }
                        break;
                    case 1:
                        Resolution resolution = (Resolution) obj;
                        resolution.getClass();
                        if (resolution.equals((Resolution) cg3Var.e)) {
                            cg3Var.e = null;
                        }
                        break;
                    default:
                        float fFloatValue = ((Float) obj).floatValue();
                        if (Math.abs(fFloatValue) <= Float.MAX_VALUE && fFloatValue > 0.0f && (listOfResolutions = (ListOfResolutions) ((IChangeResolutionViewModel) cg3Var.a).a().getValue()) != null && !IChangeResolutionViewModelSWIGJNI.ListOfResolutions_isEmpty(listOfResolutions.m, listOfResolutions)) {
                            cg3Var.a(listOfResolutions, fFloatValue);
                            break;
                        }
                        break;
                }
            }
        };
        this.g = observer2;
        final byte b3 = 2;
        Observer observer3 = new Observer(this) { // from class: o.r50
            public final /* synthetic */ cg3 n;

            {
                this.n = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // androidx.lifecycle.Observer
            public final void a(Object obj) {
                Float f;
                ListOfResolutions listOfResolutions;
                byte b4 = b3;
                cg3 cg3Var = this.n;
                switch (b4) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        if (!list.isEmpty() && (f = (Float) ((IRemoteScreenInformationViewModel) cg3Var.b).a().getValue()) != null && Math.abs(f.floatValue()) <= Float.MAX_VALUE && f.floatValue() > 0.0f) {
                            cg3Var.a(list, f.floatValue());
                            break;
                        }
                        break;
                    case 1:
                        Resolution resolution = (Resolution) obj;
                        resolution.getClass();
                        if (resolution.equals((Resolution) cg3Var.e)) {
                            cg3Var.e = null;
                        }
                        break;
                    default:
                        float fFloatValue = ((Float) obj).floatValue();
                        if (Math.abs(fFloatValue) <= Float.MAX_VALUE && fFloatValue > 0.0f && (listOfResolutions = (ListOfResolutions) ((IChangeResolutionViewModel) cg3Var.a).a().getValue()) != null && !IChangeResolutionViewModelSWIGJNI.ListOfResolutions_isEmpty(listOfResolutions.m, listOfResolutions)) {
                            cg3Var.a(listOfResolutions, fFloatValue);
                            break;
                        }
                        break;
                }
            }
        };
        this.h = observer3;
        iChangeResolutionViewModel.a().observeForever(observer);
        iChangeResolutionViewModel.b().observeForever(observer2);
        iRemoteScreenInformationViewModel.a().observeForever(observer3);
    }
}
