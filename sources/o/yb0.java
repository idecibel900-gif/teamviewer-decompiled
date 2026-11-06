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
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ContactEditViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ContactEditViewModelSWIGJNI;
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo/yb0;", "Lo/zb0;", "Lo/bi3;", "Lo/hq4;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yb0 extends zb0 implements bi3, hq4 {
    public static final /* synthetic */ int z0 = 0;
    public la3 s0;
    public long t0;
    public t33 u0;
    public TextInputLayout v0;
    public AutoCompleteTextView w0;
    public final b6 x0 = new b6(this, (byte) 2);
    public final c6 y0 = new c6((byte) 2);

    @Override // o.zb0, o.fv2
    public final hk7 C0(String str) {
        str.getClass();
        if (str.equals("delete_partner_positive")) {
            return this.x0;
        }
        if (str.equals("delete_partner_negative")) {
            return this.y0;
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
        this.t0 = jLongValue;
        if (bundle == null || (t33Var = (t33) pm8.w(bundle, "memberType", t33.class)) == null) {
            Bundle bundle3 = this.r;
            t33Var = bundle3 != null ? (t33) pm8.w(bundle3, "memberType", t33.class) : null;
            if (t33Var == null) {
                t33Var = t33.n;
            }
        }
        this.u0 = t33Var;
        if (bundle == null) {
            ut2 ut2VarE = D().E(R.id.avatar_image_container);
            if (it1.c == null) {
                im3.e0("viewFactory");
                throw null;
            }
            t33 t33Var2 = this.u0;
            if (t33Var2 == null) {
                im3.e0("type");
                throw null;
            }
            p33 p33VarO = ep3.o(this.t0, t33Var2);
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
        String strContactEditViewModel_GetDisplayName;
        g33 g33Var;
        String string;
        layoutInflater.getClass();
        p0().setTitle(I(R.string.tv_contact_edit_title));
        View viewInflate = layoutInflater.inflate(R.layout.buddy_contact_edit_details_fragment, viewGroup, false);
        if (zu1.c == null) {
            hk0.g("Required value was null.");
            return null;
        }
        dl5 dl5Var = new dl5(new x26(this.t0, (byte) 2), (byte) 2);
        ve8 g0 = getG0();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(j71.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.s0 = (la3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        TextView textView = (TextView) viewInflate.findViewById(R.id.contact_name);
        MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.delete_button);
        View viewFindViewById = viewInflate.findViewById(R.id.tv_group_dropdown);
        viewFindViewById.getClass();
        this.w0 = (AutoCompleteTextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_description_field);
        viewFindViewById2.getClass();
        this.v0 = (TextInputLayout) viewFindViewById2;
        la3 la3Var = this.s0;
        if (la3Var != null) {
            ((j71) la3Var).r.a(new xb0(this, (byte) 1));
        }
        materialButton.setOnClickListener(new io.sentry.android.core.p2(this, (byte) 2));
        la3 la3Var2 = this.s0;
        if (la3Var2 != null) {
            ContactEditViewModel contactEditViewModel = ((j71) la3Var2).n;
            strContactEditViewModel_GetDisplayName = ContactEditViewModelSWIGJNI.ContactEditViewModel_GetDisplayName(contactEditViewModel.a, contactEditViewModel);
        } else {
            strContactEditViewModel_GetDisplayName = null;
        }
        textView.setText(strContactEditViewModel_GetDisplayName);
        TextInputLayout textInputLayout = this.v0;
        if (textInputLayout == null) {
            im3.e0("descriptionField");
            throw null;
        }
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            if (bundle == null) {
                la3 la3Var3 = this.s0;
                if (la3Var3 != null) {
                    ContactEditViewModel contactEditViewModel2 = ((j71) la3Var3).n;
                    string = ContactEditViewModelSWIGJNI.ContactEditViewModel_GetNote(contactEditViewModel2.a, contactEditViewModel2);
                } else {
                    string = null;
                }
            } else {
                string = bundle.getString("description_text");
            }
            editText.setText(string);
        }
        la3 la3Var4 = this.s0;
        if (la3Var4 != null) {
            j71 j71Var = (j71) la3Var4;
            ArrayList arrayList = new ArrayList();
            GroupListViewModel groupListViewModel = j71Var.p;
            int iGroupListViewModel_GetSize = GroupListViewModelSWIGJNI.GroupListViewModel_GetSize(groupListViewModel.a, groupListViewModel);
            for (int i = 0; i < iGroupListViewModel_GetSize; i++) {
                PListGroupID pListGroupIDA = groupListViewModel.a(i);
                GroupListElementViewModel groupListElementViewModelK = ds1.k(pListGroupIDA);
                String strGroupListElementViewModel_GetName = GroupListElementViewModelSWIGJNI.GroupListElementViewModel_GetName(groupListElementViewModelK.c, groupListElementViewModelK);
                GroupListElementViewModel groupListElementViewModelK2 = ds1.k(pListGroupIDA);
                arrayList.add(GroupListElementViewModelSWIGJNI.GroupListElementViewModel_GetName(groupListElementViewModelK2.c, groupListElementViewModelK2));
                j71Var.q.put(strGroupListElementViewModel_GetName, pListGroupIDA);
            }
            g33Var = new g33(r0(), arrayList);
        } else {
            g33Var = null;
        }
        AutoCompleteTextView autoCompleteTextView = this.w0;
        if (autoCompleteTextView == null) {
            im3.e0("groupFieldDropdown");
            throw null;
        }
        autoCompleteTextView.setAdapter(g33Var);
        la3 la3Var5 = this.s0;
        if (la3Var5 != null) {
            GroupListViewModel groupListViewModelL = ds1.l(true);
            ContactEditViewModel contactEditViewModel3 = ((j71) la3Var5).n;
            contactEditViewModel3.getClass();
            PListGroupID pListGroupID = new PListGroupID(0, ContactEditViewModelSWIGJNI.ContactEditViewModel_GetGroupID(contactEditViewModel3.a, contactEditViewModel3));
            int iGroupListViewModel_GetIndexForGroupID = GroupListViewModelSWIGJNI.GroupListViewModel_GetIndexForGroupID(groupListViewModelL.a, groupListViewModelL, PListGroupID.a(pListGroupID), pListGroupID);
            AutoCompleteTextView autoCompleteTextView2 = this.w0;
            if (autoCompleteTextView2 == null) {
                im3.e0("groupFieldDropdown");
                throw null;
            }
            autoCompleteTextView2.setListSelection(iGroupListViewModel_GetIndexForGroupID);
        }
        la3 la3Var6 = this.s0;
        if (la3Var6 != null) {
            ContactEditViewModel contactEditViewModel4 = ((j71) la3Var6).n;
            contactEditViewModel4.getClass();
            GroupListElementViewModel groupListElementViewModelK3 = ds1.k(new PListGroupID(0, ContactEditViewModelSWIGJNI.ContactEditViewModel_GetGroupID(contactEditViewModel4.a, contactEditViewModel4)));
            String strGroupListElementViewModel_GetName2 = GroupListElementViewModelSWIGJNI.GroupListElementViewModel_GetName(groupListElementViewModelK3.c, groupListElementViewModelK3);
            strGroupListElementViewModel_GetName2.getClass();
            AutoCompleteTextView autoCompleteTextView3 = this.w0;
            if (autoCompleteTextView3 == null) {
                im3.e0("groupFieldDropdown");
                throw null;
            }
            autoCompleteTextView3.setText((CharSequence) strGroupListElementViewModel_GetName2, false);
        }
        AutoCompleteTextView autoCompleteTextView4 = this.w0;
        if (autoCompleteTextView4 == null) {
            im3.e0("groupFieldDropdown");
            throw null;
        }
        autoCompleteTextView4.setOnFocusChangeListener(new v6(this, (byte) 2));
        p0().v(this, L());
        return viewInflate;
    }

    @Override // o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        E0(bundle);
        bundle.putLong("buddy_id", this.t0);
        t33 t33Var = this.u0;
        if (t33Var == null) {
            im3.e0("type");
            throw null;
        }
        bundle.putSerializable("memberType", t33Var);
        TextInputLayout textInputLayout = this.v0;
        if (textInputLayout == null) {
            im3.e0("descriptionField");
            throw null;
        }
        EditText editText = textInputLayout.getEditText();
        bundle.putString("description_text", String.valueOf(editText != null ? editText.getText() : null));
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.check_mark_edit_button) {
            return false;
        }
        la3 la3Var = this.s0;
        if (la3Var == null) {
            return true;
        }
        Context contextR0 = r0();
        AutoCompleteTextView autoCompleteTextView = this.w0;
        if (autoCompleteTextView == null) {
            im3.e0("groupFieldDropdown");
            throw null;
        }
        String string = autoCompleteTextView.getText().toString();
        TextInputLayout textInputLayout = this.v0;
        if (textInputLayout == null) {
            im3.e0("descriptionField");
            throw null;
        }
        EditText editText = textInputLayout.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        xb0 xb0Var = new xb0(this, (byte) 0);
        j71 j71Var = (j71) la3Var;
        string.getClass();
        WeakReference weakReference = new WeakReference(xb0Var);
        ContactEditViewModel contactEditViewModel = j71Var.n;
        PListGroupID pListGroupID = (PListGroupID) j71Var.q.get(string);
        vy2 vy2Var = new vy2(contextR0, "BuddyContactEditDetailsViewModelWrapper", "update contact failed");
        ContactEditViewModelSWIGJNI.ContactEditViewModel_UpdateContact(contactEditViewModel.a, contactEditViewModel, PListGroupID.a(pListGroupID), pListGroupID, strValueOf, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var), vy2Var);
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
