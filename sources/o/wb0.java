package o;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerEditViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerEditViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo/wb0;", "Lo/zb0;", "Lo/bi3;", "Lo/hq4;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wb0 extends zb0 implements bi3, hq4 {
    public static final /* synthetic */ int B0 = 0;
    public TextInputLayout s0;
    public TextInputLayout t0;
    public TextInputLayout u0;
    public AutoCompleteTextView v0;
    public t33 w0;
    public ga3 x0;
    public long y0;
    public final b6 z0 = new b6(this, (byte) 1);
    public final c6 A0 = new c6((byte) 1);

    @Override // o.zb0, o.fv2
    public final hk7 C0(String str) {
        str.getClass();
        if (str.equals("delete_partner_positive")) {
            return this.z0;
        }
        if (str.equals("delete_partner_negative")) {
            return this.A0;
        }
        return null;
    }

    @Override // o.zb0
    public final boolean G0() {
        return true;
    }

    @Override // o.fv2, o.ut2
    public final void X(Bundle bundle) {
        long jLongValue;
        t33 t33Var;
        super.X(bundle);
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("buddy_id")) : null;
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            Bundle bundle2 = this.r;
            jLongValue = bundle2 != null ? bundle2.getLong("buddy_id") : 0L;
        }
        this.y0 = jLongValue;
        if (bundle == null || (t33Var = (t33) pm8.w(bundle, "memberType", t33.class)) == null) {
            Bundle bundle3 = this.r;
            t33Var = bundle3 != null ? (t33) pm8.w(bundle3, "memberType", t33.class) : null;
            if (t33Var == null) {
                t33Var = t33.n;
            }
        }
        this.w0 = t33Var;
        if (bundle == null) {
            ut2 ut2VarE = D().E(R.id.avatar_image_container);
            if (it1.c == null) {
                im3.e0("viewFactory");
                throw null;
            }
            t33 t33Var2 = this.w0;
            if (t33Var2 == null) {
                im3.e0("type");
                throw null;
            }
            p33 p33VarO = ep3.o(this.y0, t33Var2);
            if (ut2VarE == null) {
                su2 su2VarD = D();
                su2VarD.getClass();
                w10 w10Var = new w10(su2VarD);
                w10Var.h(R.id.avatar_image_container, p33VarO, null, 1);
                w10Var.f();
            }
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g33 g33Var;
        ga3 ga3Var;
        nw4 nw4Var;
        String string;
        String string2;
        String strComputerEditViewModel_GetDisplayName;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.buddy_computer_edit_details_fragment, viewGroup, false);
        p0().setTitle(I(R.string.tv_device_edit_title));
        if (zu1.c == null) {
            hk0.g("Required value was null.");
            return null;
        }
        dl5 dl5Var = new dl5(new x26(this.y0, (byte) 1), (byte) 2);
        ve8 g0 = getG0();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(h11.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.x0 = (ga3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        View viewFindViewById = viewInflate.findViewById(R.id.tv_group_dropdown);
        viewFindViewById.getClass();
        this.v0 = (AutoCompleteTextView) viewFindViewById;
        TextView textView = (TextView) viewInflate.findViewById(R.id.device_name);
        MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.delete_button);
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_password_field);
        viewFindViewById2.getClass();
        this.t0 = (TextInputLayout) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.tv_alias_field);
        viewFindViewById3.getClass();
        this.s0 = (TextInputLayout) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.tv_description_field);
        viewFindViewById4.getClass();
        this.u0 = (TextInputLayout) viewFindViewById4;
        ga3 ga3Var2 = this.x0;
        if (ga3Var2 != null) {
            ((h11) ga3Var2).u.a(new vb0(this, (byte) 1));
        }
        materialButton.setOnClickListener(new io.sentry.android.core.p2(this, (byte) 1));
        if (textView != null) {
            ga3 ga3Var3 = this.x0;
            if (ga3Var3 != null) {
                ComputerEditViewModel computerEditViewModel = ((h11) ga3Var3).n;
                strComputerEditViewModel_GetDisplayName = ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetDisplayName(computerEditViewModel.a, computerEditViewModel);
            } else {
                strComputerEditViewModel_GetDisplayName = null;
            }
            textView.setText(strComputerEditViewModel_GetDisplayName);
        }
        TextInputLayout textInputLayout = this.s0;
        if (textInputLayout == null) {
            im3.e0("aliasField");
            throw null;
        }
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            if (bundle == null) {
                ga3 ga3Var4 = this.x0;
                if (ga3Var4 != null) {
                    ComputerEditViewModel computerEditViewModel2 = ((h11) ga3Var4).n;
                    string2 = ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetAlias(computerEditViewModel2.a, computerEditViewModel2);
                } else {
                    string2 = null;
                }
            } else {
                string2 = bundle.getString("alias_text");
            }
            editText.setText(string2);
        }
        TextInputLayout textInputLayout2 = this.u0;
        if (textInputLayout2 == null) {
            im3.e0("descriptionField");
            throw null;
        }
        EditText editText2 = textInputLayout2.getEditText();
        if (editText2 != null) {
            if (bundle == null) {
                ga3 ga3Var5 = this.x0;
                if (ga3Var5 != null) {
                    ComputerEditViewModel computerEditViewModel3 = ((h11) ga3Var5).n;
                    string = ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetNote(computerEditViewModel3.a, computerEditViewModel3);
                } else {
                    string = null;
                }
            } else {
                string = bundle.getString("description_text");
            }
            editText2.setText(string);
        }
        p pVar = new p(this, (byte) 1);
        ga3 ga3Var6 = this.x0;
        if (ga3Var6 != null && (nw4Var = ((h11) ga3Var6).q) != null) {
            nw4Var.observe(L(), pVar);
        }
        if (bundle != null) {
            String string3 = bundle.getString("password_text");
            if (string3 != null && (ga3Var = this.x0) != null) {
                ((h11) ga3Var).q.setValue(string3);
            }
        } else {
            ga3 ga3Var7 = this.x0;
            if (ga3Var7 != null) {
                h11 h11Var = (h11) ga3Var7;
                nw4 nw4Var2 = h11Var.q;
                ComputerEditViewModel computerEditViewModel4 = h11Var.n;
                nw4Var2.setValue(ComputerEditViewModelSWIGJNI.ComputerEditViewModel_HasPasswordSet(computerEditViewModel4.a, computerEditViewModel4) ? "************" : "");
            }
        }
        TextInputLayout textInputLayout3 = this.t0;
        if (textInputLayout3 == null) {
            im3.e0("passwordField");
            throw null;
        }
        EditText editText3 = textInputLayout3.getEditText();
        if (editText3 != null) {
            ga3 ga3Var8 = this.x0;
            editText3.setOnFocusChangeListener(ga3Var8 != null ? new v6((h11) ga3Var8, (byte) 5) : null);
        }
        TextInputLayout textInputLayout4 = this.t0;
        if (textInputLayout4 == null) {
            im3.e0("passwordField");
            throw null;
        }
        EditText editText4 = textInputLayout4.getEditText();
        if (editText4 != null) {
            ga3 ga3Var9 = this.x0;
            editText4.addTextChangedListener(ga3Var9 != null ? new hc0((h11) ga3Var9, (byte) 3) : null);
        }
        ga3 ga3Var10 = this.x0;
        if (ga3Var10 != null) {
            h11 h11Var2 = (h11) ga3Var10;
            ArrayList arrayList = new ArrayList();
            GroupListViewModel groupListViewModel = h11Var2.s;
            int iGroupListViewModel_GetSize = GroupListViewModelSWIGJNI.GroupListViewModel_GetSize(groupListViewModel.a, groupListViewModel);
            for (int i = 0; i < iGroupListViewModel_GetSize; i++) {
                PListGroupID pListGroupIDA = groupListViewModel.a(i);
                GroupListElementViewModel groupListElementViewModelK = ds1.k(pListGroupIDA);
                String strGroupListElementViewModel_GetName = GroupListElementViewModelSWIGJNI.GroupListElementViewModel_GetName(groupListElementViewModelK.c, groupListElementViewModelK);
                GroupListElementViewModel groupListElementViewModelK2 = ds1.k(pListGroupIDA);
                arrayList.add(GroupListElementViewModelSWIGJNI.GroupListElementViewModel_GetName(groupListElementViewModelK2.c, groupListElementViewModelK2));
                h11Var2.r.put(strGroupListElementViewModel_GetName, pListGroupIDA);
            }
            g33Var = new g33(r0(), arrayList);
        } else {
            g33Var = null;
        }
        AutoCompleteTextView autoCompleteTextView = this.v0;
        if (autoCompleteTextView == null) {
            im3.e0("groupFieldDropdown");
            throw null;
        }
        autoCompleteTextView.setAdapter(g33Var);
        ga3 ga3Var11 = this.x0;
        if (ga3Var11 != null) {
            GroupListViewModel groupListViewModelL = ds1.l(true);
            ComputerEditViewModel computerEditViewModel5 = ((h11) ga3Var11).n;
            computerEditViewModel5.getClass();
            PListGroupID pListGroupID = new PListGroupID(0, ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetGroupID(computerEditViewModel5.a, computerEditViewModel5));
            int iGroupListViewModel_GetIndexForGroupID = GroupListViewModelSWIGJNI.GroupListViewModel_GetIndexForGroupID(groupListViewModelL.a, groupListViewModelL, PListGroupID.a(pListGroupID), pListGroupID);
            AutoCompleteTextView autoCompleteTextView2 = this.v0;
            if (autoCompleteTextView2 == null) {
                im3.e0("groupFieldDropdown");
                throw null;
            }
            autoCompleteTextView2.setListSelection(iGroupListViewModel_GetIndexForGroupID);
        }
        ga3 ga3Var12 = this.x0;
        if (ga3Var12 != null) {
            ComputerEditViewModel computerEditViewModel6 = ((h11) ga3Var12).n;
            computerEditViewModel6.getClass();
            GroupListElementViewModel groupListElementViewModelK3 = ds1.k(new PListGroupID(0, ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetGroupID(computerEditViewModel6.a, computerEditViewModel6)));
            String strGroupListElementViewModel_GetName2 = GroupListElementViewModelSWIGJNI.GroupListElementViewModel_GetName(groupListElementViewModelK3.c, groupListElementViewModelK3);
            strGroupListElementViewModel_GetName2.getClass();
            AutoCompleteTextView autoCompleteTextView3 = this.v0;
            if (autoCompleteTextView3 == null) {
                im3.e0("groupFieldDropdown");
                throw null;
            }
            autoCompleteTextView3.setText((CharSequence) strGroupListElementViewModel_GetName2, false);
        }
        AutoCompleteTextView autoCompleteTextView4 = this.v0;
        if (autoCompleteTextView4 == null) {
            im3.e0("groupFieldDropdown");
            throw null;
        }
        autoCompleteTextView4.setOnFocusChangeListener(new v6(this, (byte) 1));
        p0().v(this, L());
        return viewInflate;
    }

    @Override // o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        E0(bundle);
        bundle.putLong("buddy_id", this.y0);
        t33 t33Var = this.w0;
        if (t33Var == null) {
            im3.e0("type");
            throw null;
        }
        bundle.putSerializable("memberType", t33Var);
        TextInputLayout textInputLayout = this.s0;
        if (textInputLayout == null) {
            return;
        }
        EditText editText = textInputLayout.getEditText();
        bundle.putString("alias_text", String.valueOf(editText != null ? editText.getText() : null));
        TextInputLayout textInputLayout2 = this.t0;
        if (textInputLayout2 == null) {
            im3.e0("passwordField");
            throw null;
        }
        EditText editText2 = textInputLayout2.getEditText();
        bundle.putString("password_text", String.valueOf(editText2 != null ? editText2.getText() : null));
        TextInputLayout textInputLayout3 = this.u0;
        if (textInputLayout3 == null) {
            im3.e0("descriptionField");
            throw null;
        }
        EditText editText3 = textInputLayout3.getEditText();
        bundle.putString("description_text", String.valueOf(editText3 != null ? editText3.getText() : null));
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.check_mark_edit_button) {
            return false;
        }
        ga3 ga3Var = this.x0;
        if (ga3Var == null) {
            return true;
        }
        Context contextR0 = r0();
        TextInputLayout textInputLayout = this.s0;
        if (textInputLayout == null) {
            im3.e0("aliasField");
            throw null;
        }
        EditText editText = textInputLayout.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        AutoCompleteTextView autoCompleteTextView = this.v0;
        if (autoCompleteTextView == null) {
            im3.e0("groupFieldDropdown");
            throw null;
        }
        String string = autoCompleteTextView.getText().toString();
        TextInputLayout textInputLayout2 = this.u0;
        if (textInputLayout2 == null) {
            im3.e0("descriptionField");
            throw null;
        }
        EditText editText2 = textInputLayout2.getEditText();
        String strValueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
        vb0 vb0Var = new vb0(this, (byte) 0);
        h11 h11Var = (h11) ga3Var;
        string.getClass();
        WeakReference weakReference = new WeakReference(vb0Var);
        ComputerEditViewModel computerEditViewModel = h11Var.n;
        String str = h11Var.t;
        boolean z = h11Var.p;
        PListGroupID pListGroupID = (PListGroupID) h11Var.r.get(string);
        vy2 vy2Var = new vy2(contextR0, "BuddyComputerEditDetailsViewModelWrapper", "update computer failed");
        ComputerEditViewModelSWIGJNI.ComputerEditViewModel_UpdateComputer(computerEditViewModel.a, computerEditViewModel, strValueOf, str, z, PListGroupID.a(pListGroupID), pListGroupID, strValueOf2, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var), vy2Var);
        Function0 function0 = (Function0) weakReference.get();
        if (function0 == null) {
            return true;
        }
        function0.a();
        return true;
    }

    @Override // o.hq4
    public final void u(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.edit_screen_menu, menu);
    }
}
