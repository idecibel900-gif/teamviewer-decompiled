package io.sentry.android.core;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.a6;
import io.sentry.d5;
import io.sentry.d6;
import io.sentry.f6;
import io.sentry.g7;
import io.sentry.o5;
import io.sentry.q7;
import io.sentry.z5;
import java.lang.ref.WeakReference;
import o.k8;

/* JADX INFO: loaded from: classes.dex */
public final class r2 extends AlertDialog {
    public boolean m;
    public io.sentry.protocol.w n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DialogInterface.OnDismissListener f124o;
    public final a6 p;
    public m2 q;
    public q2 r;
    public w0 s;
    public Uri t;

    public r2(Context context) {
        Activity activityA;
        super(context, 0);
        this.m = false;
        a6 feedbackOptions = d5.c().l().getFeedbackOptions();
        a6 a6Var = new a6();
        a6Var.a = false;
        a6Var.b = true;
        a6Var.c = false;
        a6Var.d = true;
        a6Var.e = true;
        a6Var.f = true;
        a6Var.g = false;
        a6Var.h = true;
        a6Var.a = feedbackOptions.a;
        a6Var.b = feedbackOptions.b;
        a6Var.c = feedbackOptions.c;
        a6Var.d = feedbackOptions.d;
        a6Var.e = feedbackOptions.e;
        a6Var.f = feedbackOptions.f;
        a6Var.g = feedbackOptions.g;
        a6Var.h = feedbackOptions.h;
        a6Var.i = feedbackOptions.i;
        a6Var.j = feedbackOptions.j;
        this.p = a6Var;
        d6.d().a("UserFeedbackWidget");
        a6 feedbackOptions2 = d5.c().l().getFeedbackOptions();
        if (!a6Var.g || feedbackOptions2.i.u() || (activityA = a(context)) == null) {
            return;
        }
        this.q = new m2(d5.c().l().getLogger());
        WeakReference weakReference = new WeakReference(activityA);
        this.q.c(activityA, new q7(this, weakReference, (byte) 4));
        Application application = activityA.getApplication();
        q2 q2Var = new q2(this, weakReference);
        this.r = q2Var;
        application.registerActivityLifecycleCallbacks(q2Var);
    }

    public static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static FeedbackShakeIntegration b() {
        z5 z5Var = d5.c().l().getFeedbackOptions().i;
        if (z5Var instanceof FeedbackShakeIntegration) {
            return (FeedbackShakeIntegration) z5Var;
        }
        return null;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        io.sentry.protocol.i0 i0VarL;
        super.onCreate(bundle);
        setContentView(R.layout.sentry_dialog_user_feedback);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(131072);
        }
        setCancelable(this.m);
        TextView textView = (TextView) findViewById(R.id.sentry_dialog_user_feedback_title);
        ImageView imageView = (ImageView) findViewById(R.id.sentry_dialog_user_feedback_logo);
        final TextView textView2 = (TextView) findViewById(R.id.sentry_dialog_user_feedback_txt_name);
        final EditText editText = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_name);
        final TextView textView3 = (TextView) findViewById(R.id.sentry_dialog_user_feedback_txt_email);
        final EditText editText2 = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_email);
        final TextView textView4 = (TextView) findViewById(R.id.sentry_dialog_user_feedback_txt_description);
        final EditText editText3 = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_description);
        Button button = (Button) findViewById(R.id.sentry_dialog_user_feedback_btn_send);
        Button button2 = (Button) findViewById(R.id.sentry_dialog_user_feedback_btn_cancel);
        final Button button3 = (Button) findViewById(R.id.sentry_dialog_user_feedback_btn_add_screenshot);
        button3.setVisibility(8);
        final a6 a6Var = this.p;
        button3.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.n2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r2 r2Var = this.m;
                if (r2Var.t != null) {
                    r2Var.t = null;
                    a6Var.getClass();
                    button3.setText("Add a screenshot");
                    return;
                }
                w0 w0Var = r2Var.s;
                if (w0Var != null) {
                    try {
                        w0Var.a();
                    } catch (LinkageError e) {
                        d5.c().l().getLogger().d(f6.ERROR, "Failed to launch the screenshot picker.", e);
                    } catch (Throwable th) {
                        io.sentry.util.b.w(th);
                        d5.c().l().getLogger().d(f6.ERROR, "Failed to launch the screenshot picker.", th);
                    }
                }
            }
        });
        byte b = 0;
        if (a6Var.f) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        if (a6Var.b || a6Var.a) {
            textView2.setVisibility(0);
            editText.setVisibility(0);
            textView2.setText("Name");
            editText.setHint("Your Name");
            if (a6Var.a) {
                textView2.append(" (Required)");
            }
        } else {
            textView2.setVisibility(8);
            editText.setVisibility(8);
        }
        if (a6Var.d || a6Var.c) {
            textView3.setVisibility(0);
            editText2.setVisibility(0);
            textView3.setText("Email");
            editText2.setHint("your.email@example.org");
            if (a6Var.c) {
                textView3.append(" (Required)");
            }
        } else {
            textView3.setVisibility(8);
            editText2.setVisibility(8);
        }
        if (a6Var.e && (i0VarL = d5.c().v().L()) != null) {
            editText.setText(i0VarL.f232o);
            editText2.setText(i0VarL.m);
        }
        textView4.setText("Description");
        textView4.append(" (Required)");
        editText3.setHint("What's the bug? What did you expect?");
        textView.setText("Report a Bug");
        button.setText("Send Bug Report");
        button.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.o2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText editText4 = editText;
                String strTrim = editText4.getText().toString().trim();
                EditText editText5 = editText2;
                String strTrim2 = editText5.getText().toString().trim();
                EditText editText6 = editText3;
                String strTrim3 = editText6.getText().toString().trim();
                boolean zIsEmpty = strTrim.isEmpty();
                a6 a6Var2 = a6Var;
                if (zIsEmpty && a6Var2.a) {
                    editText4.setError(textView2.getText());
                    return;
                }
                if (strTrim2.isEmpty() && a6Var2.c) {
                    editText5.setError(textView3.getText());
                    return;
                }
                if (strTrim3.isEmpty()) {
                    editText6.setError(textView4.getText());
                    return;
                }
                io.sentry.protocol.k kVar = new io.sentry.protocol.k(strTrim3);
                kVar.f234o = strTrim;
                kVar.n = strTrim2;
                r2 r2Var = this.m;
                io.sentry.protocol.w wVar = r2Var.n;
                if (wVar != null) {
                    kVar.q = wVar;
                }
                io.sentry.p0 p0Var = new io.sentry.p0();
                Uri uri = r2Var.t;
                if (uri != null) {
                    try {
                        ContentResolver contentResolver = r2Var.getContext().getContentResolver();
                        String type = contentResolver.getType(uri);
                        if (type == null) {
                            type = "image/png";
                        }
                        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
                        if (extensionFromMimeType == null) {
                            extensionFromMimeType = "png";
                        }
                        p0Var.b.add(new io.sentry.a(new o5(contentResolver, uri, (byte) 7), "screenshot.".concat(extensionFromMimeType), type));
                    } catch (Throwable th) {
                        io.sentry.util.b.w(th);
                        d5.c().l().getLogger().d(f6.ERROR, "Failed to attach image to feedback.", th);
                    }
                }
                if (d5.c().w().f(kVar, p0Var).equals(io.sentry.protocol.w.n)) {
                    a6Var2.getClass();
                } else {
                    Context context = r2Var.getContext();
                    a6Var2.getClass();
                    Toast.makeText(context, "Thank you for your report!", 0).show();
                }
                r2Var.cancel();
            }
        });
        button2.setText("Cancel");
        button2.setOnClickListener(new p2(this, b));
        setOnDismissListener(this.f124o);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FeedbackShakeIntegration feedbackShakeIntegrationB = b();
        if (feedbackShakeIntegrationB != null) {
            feedbackShakeIntegrationB.j(this);
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        EditText editText = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_description);
        editText.getText().clear();
        editText.setError(null);
        g7 g7VarL = d5.c().l();
        Button button = (Button) findViewById(R.id.sentry_dialog_user_feedback_btn_add_screenshot);
        this.t = null;
        a6 a6Var = this.p;
        a6Var.getClass();
        button.setText("Add a screenshot");
        if (a6Var.h) {
            Activity activityA = a(getContext());
            if (activityA != null) {
                a6Var.j.getClass();
                if (io.sentry.util.i.b(g7VarL, "o.my0") && io.sentry.util.i.b(g7VarL, "o.e8")) {
                    try {
                        this.s = w0.b(activityA, new e(this, g7VarL, button));
                    } catch (LinkageError e) {
                        g7VarL.getLogger().d(f6.INFO, "androidx.activity is too old for the screenshot picker.", e);
                    } catch (Throwable th) {
                        io.sentry.util.b.w(th);
                        g7VarL.getLogger().d(f6.ERROR, "Failed to register the screenshot picker.", th);
                    }
                }
            }
            if (this.s != null) {
                button.setVisibility(0);
            } else {
                button.setVisibility(8);
                g7VarL.getLogger().g(f6.WARNING, "Feedback screenshot button won't be shown. It requires the androidx.activity dependency and the feedback form being shown from a ComponentActivity.", new Object[0]);
            }
        }
        a6 feedbackOptions = g7VarL.getFeedbackOptions();
        FeedbackShakeIntegration feedbackShakeIntegrationB = b();
        Activity activityA2 = a(getContext());
        if (feedbackShakeIntegrationB != null && activityA2 != null) {
            feedbackShakeIntegrationB.r.add(new f1(activityA2, this));
            feedbackShakeIntegrationB.n.d();
        }
        feedbackOptions.getClass();
        g7VarL.getReplayController().e(Boolean.FALSE);
        this.n = g7VarL.getReplayController().j();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        w0 w0Var = this.s;
        if (w0Var != null) {
            ((k8) w0Var.a).b();
            this.s = null;
        }
        FeedbackShakeIntegration feedbackShakeIntegrationB = b();
        if (feedbackShakeIntegrationB != null) {
            feedbackShakeIntegrationB.j(this);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        this.m = z;
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f124o = onDismissListener;
        d5.c().l().getFeedbackOptions().getClass();
        super.setOnDismissListener(this.f124o);
    }

    @Override // android.app.Dialog
    public final void show() {
        io.sentry.n1 n1VarC = d5.c();
        g7 g7VarL = n1VarC.l();
        if (n1VarC.isEnabled() && g7VarL.isEnabled()) {
            super.show();
        } else {
            g7VarL.getLogger().g(f6.WARNING, "Sentry is disabled. Feedback dialog won't be shown.", new Object[0]);
        }
    }
}
