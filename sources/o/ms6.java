package o;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/ms6;", "Lo/gk7;", "Lo/yc3;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ms6 extends gk7 implements yc3 {
    public ns6 e1;

    public final void P0() {
        Dialog dialog = this.A0;
        if (dialog != null) {
            dialog.dismiss();
        }
        EventHub.e(EventHub.e.f(), EventType.EVENT_COMMENT_SESSION_ENDED);
    }

    @Override // o.gk7, o.v02, o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        Bundle bundle2 = this.r;
        if (bundle2 == null) {
            ye4.c("SessionCommentDialogFragment", "comment view without session guid");
            P0();
            return;
        }
        Parcelable parcelable = (Parcelable) pm8.u(bundle2, "commentSessionSender", Parcelable.class);
        if (!(parcelable instanceof ax0)) {
            ye4.c("SessionCommentDialogFragment", "comment view without valid sender");
            P0();
            return;
        }
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return;
        }
        dl5 dl5Var = new dl5(new a26((Object) c36Var, parcelable, (byte) 6), (byte) 2);
        ve8 ve8VarO = o();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(ns6.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.e1 = (ns6) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        String string = null;
        Date date = null;
        final byte b = 0;
        View viewInflate = LayoutInflater.from(E()).inflate(R.layout.dialog_comment_session, (ViewGroup) null, false);
        K0(viewInflate);
        this.Y0 = false;
        ((EditText) viewInflate.findViewById(R.id.commentSessionInputText)).addTextChangedListener(new hc0(this, (byte) 8));
        TextView textView = (TextView) viewInflate.findViewById(R.id.commentSessionTextDetailed);
        ns6 ns6Var = this.e1;
        if (ns6Var != null) {
            Resources resources = ns6Var.n;
            ax0 ax0Var = ns6Var.f1599o;
            String str = ax0Var.m;
            String str2 = ax0Var.n;
            try {
                date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH).parse(str2);
            } catch (ParseException unused) {
                ye4.c("SessionCommentViewModel", "could not parse date. has the mco changed?");
            }
            if (date != null) {
                str2 = DateFormat.getDateTimeInstance(3, 3).format(date);
                str2.getClass();
            }
            string = resources.getString(R.string.tv_comment_session_description_text, str, str2);
            string.getClass();
        }
        textView.setText(string);
        ((Button) viewInflate.findViewById(R.id.buttonCommitComment)).setOnClickListener(new View.OnClickListener(this) { // from class: o.ls6
            public final /* synthetic */ ms6 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                ms6 ms6Var = this.n;
                switch (b2) {
                    case 0:
                        ns6 ns6Var2 = ms6Var.e1;
                        if (ns6Var2 != null) {
                            ax0 ax0Var2 = ns6Var2.f1599o;
                            String str3 = ns6Var2.r;
                            ax0Var2.getClass();
                            str3.getClass();
                            bu7.CACHEDTHREADPOOL.a(new io.sentry.u4((Object) ax0Var2, (Object) str3, (byte) 21));
                            ns6Var2.V0();
                        }
                        break;
                    default:
                        ns6 ns6Var3 = ms6Var.e1;
                        if (ns6Var3 != null) {
                            ns6Var3.V0();
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        ((Button) viewInflate.findViewById(R.id.buttonNoComment)).setOnClickListener(new View.OnClickListener(this) { // from class: o.ls6
            public final /* synthetic */ ms6 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                ms6 ms6Var = this.n;
                switch (b3) {
                    case 0:
                        ns6 ns6Var2 = ms6Var.e1;
                        if (ns6Var2 != null) {
                            ax0 ax0Var2 = ns6Var2.f1599o;
                            String str3 = ns6Var2.r;
                            ax0Var2.getClass();
                            str3.getClass();
                            bu7.CACHEDTHREADPOOL.a(new io.sentry.u4((Object) ax0Var2, (Object) str3, (byte) 21));
                            ns6Var2.V0();
                        }
                        break;
                    default:
                        ns6 ns6Var3 = ms6Var.e1;
                        if (ns6Var3 != null) {
                            ns6Var3.V0();
                        }
                        break;
                }
            }
        });
    }

    @Override // o.ut2
    public final void f0() {
        this.S = true;
        ns6 ns6Var = this.e1;
        if (ns6Var != null) {
            HashSet hashSet = ns6Var.p;
            hashSet.getClass();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                weakReference.getClass();
                if (weakReference.get() == null) {
                    it.remove();
                }
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                WeakReference weakReference2 = (WeakReference) it2.next();
                weakReference2.getClass();
                if (im3.n(weakReference2.get(), this)) {
                    it2.remove();
                }
            }
        }
    }

    @Override // o.gk7, o.ut2
    public final void g0() {
        super.g0();
        ns6 ns6Var = this.e1;
        if (ns6Var != null) {
            HashSet hashSet = ns6Var.p;
            hashSet.getClass();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                weakReference.getClass();
                if (weakReference.get() == null) {
                    it.remove();
                }
            }
            hashSet.add(new WeakReference(this));
        }
    }
}
