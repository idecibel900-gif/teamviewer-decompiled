package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.teamviewer.commonresourcelib.swig.FeedbackViewModelFactory;
import com.teamviewer.commonresourcelib.swig.IFeedbackViewModel;
import com.teamviewer.commonresourcelib.swig.IRatingViewModel;
import com.teamviewer.commonresourcelib.swig.RatingViewModelFactory;
import com.teamviewer.swigcallbacklib.BoolSignalCallback;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lo/ii2;", "Lo/ut2;", "<init>", "()V", "o/gi2", "CommonResourceLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ii2 extends ut2 {
    public boolean p0;
    public boolean q0;
    public int r0;
    public IFeedbackViewModel s0;
    public IRatingViewModel t0;
    public final BoolSignalCallback u0 = SignalCallbackFactory.INSTANCE.getInstance().boolSignalCallback(new a81(this, 16));

    /* JADX WARN: Code duplicated, block: B:12:0x0010  */
    public final boolean A0() {
        k25 k25Var;
        ww3 ww3VarA = l25.a();
        if (ww3VarA != null) {
            synchronized (ww3VarA) {
                k25Var = ww3VarA.a;
            }
            if (k25Var == null) {
                k25Var = k25.f1224o;
            }
        } else {
            k25Var = k25.f1224o;
        }
        if (k25Var == k25.f1224o) {
            return true;
        }
        n02 n02Var = new n02(r0());
        n02Var.s = true;
        String strI = I(R.string.tv_rating_NoConnection);
        strI.getClass();
        n02Var.d = strI;
        String string = r0().getString(R.string.tv_ok);
        string.getClass();
        ju juVar = new ju((byte) 17);
        n02Var.q = string;
        n02Var.r = juVar;
        String strI2 = I(R.string.tv_rating_ProductWasUnableToConnectToTheInternetMessage);
        strI2.getClass();
        n02Var.e = strI2;
        n02Var.f = false;
        n02Var.a().show();
        return false;
    }

    public final void B0(int i) {
        n02 n02Var = new n02(r0());
        String strI = I(R.string.tv_feedback_ThankYou);
        strI.getClass();
        n02Var.d = strI;
        String strI2 = I(R.string.tv_ok);
        strI2.getClass();
        hi2 hi2Var = new hi2(this, (byte) 0);
        n02Var.q = strI2;
        n02Var.r = hi2Var;
        String strI3 = I(i);
        strI3.getClass();
        n02Var.e = strI3;
        n02Var.f = false;
        od odVarA = n02Var.a();
        odVarA.setCancelable(false);
        odVarA.show();
    }

    public final void C0(boolean z) {
        Boolean boolValueOf;
        View viewFindViewById = s0().findViewById(R.id.idea_radiobutton);
        viewFindViewById.getClass();
        boolean zIsChecked = ((RadioButton) viewFindViewById).isChecked();
        View viewFindViewById2 = s0().findViewById(R.id.problem_radiobutton);
        viewFindViewById2.getClass();
        boolean zIsChecked2 = ((RadioButton) viewFindViewById2).isChecked();
        View viewFindViewById3 = s0().findViewById(R.id.feedback_text_textinputlayout);
        viewFindViewById3.getClass();
        EditText editText = ((TextInputLayout) viewFindViewById3).getEditText();
        boolean z2 = false;
        if (editText != null) {
            boolValueOf = Boolean.valueOf(ub7.x0(editText.getText().toString()).toString().length() > 0);
        } else {
            boolValueOf = null;
        }
        View viewFindViewById4 = s0().findViewById(R.id.email_text_textinputlayout);
        viewFindViewById4.getClass();
        CharSequence error = ((TextInputLayout) viewFindViewById4).getError();
        boolean z3 = error == null || error.length() == 0;
        Button button = (Button) s0().findViewById(R.id.submit_feedback_button);
        if ((zIsChecked || zIsChecked2 || z) && im3.n(boolValueOf, Boolean.TRUE) && z3) {
            z2 = true;
        }
        button.setEnabled(z2);
    }

    @Override // o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle == null) {
            bundle = this.r;
        }
        if (bundle != null) {
            this.q0 = bundle.getBoolean("ScamProtectionFeedback", false);
            this.r0 = bundle.getInt("RatingId", 0);
            this.p0 = bundle.getBoolean("RatingControlsId", false);
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        IRatingViewModel iRatingViewModelGetRatingViewModel = RatingViewModelFactory.GetRatingViewModel();
        this.t0 = iRatingViewModelGetRatingViewModel;
        if (!this.p0 || this.q0) {
            if (iRatingViewModelGetRatingViewModel == null) {
                ye4.c("FeedbackAndRatingFragment", "Sending GA statistics failed. ViewModel is null.");
            } else {
                iRatingViewModelGetRatingViewModel.ReportScreenEvent(IRatingViewModel.RatingScreenEventType.FeedbackDialog);
            }
        } else if (iRatingViewModelGetRatingViewModel == null) {
            ye4.c("FeedbackAndRatingFragment", "Sending GA statistics failed. ViewModel is null.");
        } else {
            iRatingViewModelGetRatingViewModel.ReportScreenEvent(IRatingViewModel.RatingScreenEventType.RatingFeedbackDialog);
        }
        final byte b = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_feedback_and_rating, viewGroup, false);
        RatingBar ratingBar = (RatingBar) viewInflate.findViewById(R.id.rating_ratingbar);
        RadioButton radioButton = (RadioButton) viewInflate.findViewById(R.id.idea_radiobutton);
        RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(R.id.problem_radiobutton);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.feedback_text_textinputlayout);
        final TextView textView = (TextView) viewInflate.findViewById(R.id.feedback_hint_textview);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.attach_log_hint_textview);
        final Button button = (Button) viewInflate.findViewById(R.id.submit_feedback_button);
        Button button2 = (Button) viewInflate.findViewById(R.id.submit_rating_only_button);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(R.id.email_text_textinputlayout);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.top_message_textview);
        textInputLayout2.setError(null);
        final byte b2 = 1;
        textInputLayout.setCounterEnabled(true);
        textInputLayout.setCounterMaxLength(H().getInteger(R.integer.maximum_feedback_text_length));
        if (this.q0) {
            radioButton.setVisibility(8);
            radioButton2.setVisibility(8);
            String string = p0().getString(R.string.tv_feedback_ReportAProblemScam);
            string.getClass();
            textInputLayout.setHint(string);
            String string2 = p0().getString(R.string.tv_feedback_AttachLogFilesHintScam);
            string2.getClass();
            textView2.setText(string2);
            textView.setVisibility(0);
            textInputLayout.setEnabled(true);
            button.setText(R.string.tv_feedback_SubmitFeedbackDefault);
            textView.setText(R.string.tv_feedback_ExplanatoryTextProblemScam);
            textView3.setVisibility(0);
            String string3 = p0().getString(R.string.tv_feedback_IntroductionMessageScamProtection);
            string3.getClass();
            textView3.setText(string3);
        }
        byte b3 = 4;
        if (!this.p0 || this.q0) {
            textView3.setVisibility(0);
            ratingBar.setVisibility(8);
            button2.setVisibility(8);
        } else if (this.r0 < 4) {
            textView3.setVisibility(0);
            String string4 = p0().getString(R.string.tv_feedback_IntroductionMessageBad);
            string4.getClass();
            ratingBar.setRating(this.r0);
            textView3.setText(string4);
        }
        EditText editText = textInputLayout2.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new ro0(b2, textInputLayout2, this));
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new hc0(this, b3));
        }
        final byte b4 = 0;
        radioButton.setOnClickListener(new View.OnClickListener(this) { // from class: o.di2
            public final /* synthetic */ ii2 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b5 = b4;
                Button button3 = button;
                TextView textView4 = textView;
                TextInputLayout textInputLayout3 = textInputLayout;
                ii2 ii2Var = this.n;
                switch (b5) {
                    case 0:
                        String string5 = ii2Var.p0().getString(R.string.tv_feedback_ShareAnIdea);
                        string5.getClass();
                        textInputLayout3.setHint(string5);
                        textView4.setVisibility(0);
                        textInputLayout3.setEnabled(true);
                        button3.setText(R.string.tv_feedback_SubmitFeedbackIdea);
                        textView4.setText(R.string.tv_feedback_ExplanatoryTextIdea);
                        ii2Var.C0(ii2Var.q0);
                        if (view != null) {
                            Object systemService = view.getContext().getApplicationContext().getSystemService("input_method");
                            systemService.getClass();
                            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        } else {
                            ye4.c("GUIHelperFuncs", "hideSoftkeyboard(): can't hide - view is null!");
                        }
                        break;
                    default:
                        String string6 = ii2Var.p0().getString(R.string.tv_feedback_ReportAProblem);
                        string6.getClass();
                        textInputLayout3.setHint(string6);
                        textView4.setVisibility(0);
                        textInputLayout3.setEnabled(true);
                        button3.setText(R.string.tv_feedback_SubmitFeedbackProblem);
                        textView4.setText(R.string.tv_feedback_ExplanatoryTextProblem);
                        ii2Var.C0(ii2Var.q0);
                        if (view != null) {
                            Object systemService2 = view.getContext().getApplicationContext().getSystemService("input_method");
                            systemService2.getClass();
                            ((InputMethodManager) systemService2).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        } else {
                            ye4.c("GUIHelperFuncs", "hideSoftkeyboard(): can't hide - view is null!");
                        }
                        break;
                }
            }
        });
        final byte b5 = 1;
        radioButton2.setOnClickListener(new View.OnClickListener(this) { // from class: o.di2
            public final /* synthetic */ ii2 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b6 = b5;
                Button button3 = button;
                TextView textView4 = textView;
                TextInputLayout textInputLayout3 = textInputLayout;
                ii2 ii2Var = this.n;
                switch (b6) {
                    case 0:
                        String string5 = ii2Var.p0().getString(R.string.tv_feedback_ShareAnIdea);
                        string5.getClass();
                        textInputLayout3.setHint(string5);
                        textView4.setVisibility(0);
                        textInputLayout3.setEnabled(true);
                        button3.setText(R.string.tv_feedback_SubmitFeedbackIdea);
                        textView4.setText(R.string.tv_feedback_ExplanatoryTextIdea);
                        ii2Var.C0(ii2Var.q0);
                        if (view != null) {
                            Object systemService = view.getContext().getApplicationContext().getSystemService("input_method");
                            systemService.getClass();
                            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        } else {
                            ye4.c("GUIHelperFuncs", "hideSoftkeyboard(): can't hide - view is null!");
                        }
                        break;
                    default:
                        String string6 = ii2Var.p0().getString(R.string.tv_feedback_ReportAProblem);
                        string6.getClass();
                        textInputLayout3.setHint(string6);
                        textView4.setVisibility(0);
                        textInputLayout3.setEnabled(true);
                        button3.setText(R.string.tv_feedback_SubmitFeedbackProblem);
                        textView4.setText(R.string.tv_feedback_ExplanatoryTextProblem);
                        ii2Var.C0(ii2Var.q0);
                        if (view != null) {
                            Object systemService2 = view.getContext().getApplicationContext().getSystemService("input_method");
                            systemService2.getClass();
                            ((InputMethodManager) systemService2).hideSoftInputFromWindow(view.getWindowToken(), 0);
                        } else {
                            ye4.c("GUIHelperFuncs", "hideSoftkeyboard(): can't hide - view is null!");
                        }
                        break;
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener(this) { // from class: o.ei2
            public final /* synthetic */ ii2 n;

            {
                this.n = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gi2 gi2Var;
                String str;
                byte b6 = b;
                ii2 ii2Var = this.n;
                switch (b6) {
                    case 0:
                        view.getClass();
                        View viewFindViewById = ii2Var.s0().findViewById(R.id.idea_radiobutton);
                        viewFindViewById.getClass();
                        boolean zIsChecked = ((RadioButton) viewFindViewById).isChecked();
                        View viewFindViewById2 = ii2Var.s0().findViewById(R.id.problem_radiobutton);
                        viewFindViewById2.getClass();
                        boolean zIsChecked2 = ((RadioButton) viewFindViewById2).isChecked();
                        boolean z = ii2Var.q0;
                        gi2 gi2Var2 = gi2.n;
                        gi2 gi2Var3 = gi2.m;
                        if (z) {
                            gi2Var = gi2.f895o;
                        } else if (zIsChecked) {
                            gi2Var = gi2Var3;
                        } else if (zIsChecked2) {
                            gi2Var = gi2Var2;
                        }
                        if (ii2Var.A0()) {
                            view.setEnabled(false);
                        }
                        boolean z2 = ii2Var.p0;
                        IRatingViewModel iRatingViewModel = ii2Var.t0;
                        if (z2) {
                            if (iRatingViewModel == null) {
                                ye4.c("FeedbackAndRatingFragment", "Sending GA statistics failed. ViewModel is null.");
                            } else if (gi2Var == gi2Var3) {
                                iRatingViewModel.ReportActionEvent(IRatingViewModel.RatingActionEventType.FeedbackRated, "Idea");
                            } else if (gi2Var == gi2Var2) {
                                iRatingViewModel.ReportActionEvent(IRatingViewModel.RatingActionEventType.FeedbackRated, "Problem");
                            }
                        } else if (iRatingViewModel == null) {
                            ye4.c("FeedbackAndRatingFragment", "Sending GA statistics failed. ViewModel is null.");
                        } else if (gi2Var == gi2Var3) {
                            iRatingViewModel.ReportActionEvent(IRatingViewModel.RatingActionEventType.FeedbackSubmitted, "Idea");
                        } else {
                            iRatingViewModel.ReportActionEvent(IRatingViewModel.RatingActionEventType.FeedbackSubmitted, "Problem");
                        }
                        if (ii2Var.A0()) {
                            n02 n02Var = new n02(ii2Var.r0());
                            String strI = ii2Var.I(R.string.tv_feedback_ThankYou);
                            strI.getClass();
                            n02Var.d = strI;
                            IFeedbackViewModel iFeedbackViewModelGetFeedbackViewModel = ii2Var.s0;
                            if (iFeedbackViewModelGetFeedbackViewModel == null) {
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
                                iFeedbackViewModelGetFeedbackViewModel = FeedbackViewModelFactory.GetFeedbackViewModel(strConcat, str2.concat(" Android"));
                                ii2Var.s0 = iFeedbackViewModelGetFeedbackViewModel;
                            }
                            if (ii2Var.q0) {
                                iFeedbackViewModelGetFeedbackViewModel.getClass();
                                iFeedbackViewModelGetFeedbackViewModel.SetCategory("SecurityFeedback");
                            } else {
                                iFeedbackViewModelGetFeedbackViewModel.getClass();
                                View viewFindViewById3 = ii2Var.s0().findViewById(R.id.idea_radiobutton);
                                viewFindViewById3.getClass();
                                iFeedbackViewModelGetFeedbackViewModel.SetCategory(((RadioButton) viewFindViewById3).isChecked() ? "Idea" : "Problem");
                            }
                            IFeedbackViewModel iFeedbackViewModel = ii2Var.s0;
                            if (iFeedbackViewModel != null) {
                                View viewFindViewById4 = ii2Var.s0().findViewById(R.id.email_text_textinputlayout);
                                viewFindViewById4.getClass();
                                EditText editText3 = ((TextInputLayout) viewFindViewById4).getEditText();
                                iFeedbackViewModel.SetEmail(editText3 != null ? ub7.x0(editText3.getText().toString()).toString() : null);
                            }
                            IFeedbackViewModel iFeedbackViewModel2 = ii2Var.s0;
                            if (iFeedbackViewModel2 != null) {
                                View viewFindViewById5 = ii2Var.s0().findViewById(R.id.feedback_text_textinputlayout);
                                viewFindViewById5.getClass();
                                EditText editText4 = ((TextInputLayout) viewFindViewById5).getEditText();
                                iFeedbackViewModel2.SetComment(editText4 != null ? ub7.x0(editText4.getText().toString()).toString() : null);
                            }
                            IFeedbackViewModel iFeedbackViewModel3 = ii2Var.s0;
                            if (iFeedbackViewModel3 != null) {
                                iFeedbackViewModel3.SetRating(ii2Var.r0);
                            }
                            View viewFindViewById6 = ii2Var.s0().findViewById(R.id.attach_log_switch);
                            viewFindViewById6.getClass();
                            boolean zIsChecked3 = ((Switch) viewFindViewById6).isChecked();
                            IFeedbackViewModel iFeedbackViewModel4 = ii2Var.s0;
                            if (iFeedbackViewModel4 != null) {
                                iFeedbackViewModel4.SetLogFileAttached(zIsChecked3);
                            }
                            List list = lu.b;
                            Object absolutePath = zIsChecked3 ? xk0.w(ii2Var.r0()).getAbsolutePath() : null;
                            String str3 = absolutePath != null ? absolutePath : "";
                            IFeedbackViewModel iFeedbackViewModel5 = ii2Var.s0;
                            if (iFeedbackViewModel5 != null) {
                                iFeedbackViewModel5.UploadFeedback(str3, ii2Var.u0);
                            }
                        }
                        break;
                    default:
                        IRatingViewModel iRatingViewModel2 = ii2Var.t0;
                        if (iRatingViewModel2 == null) {
                            ye4.c("FeedbackAndRatingFragment", "Sending GA statistics failed. ViewModel is null.");
                        } else {
                            iRatingViewModel2.ReportActionEvent(IRatingViewModel.RatingActionEventType.SendOnlyRating, "");
                        }
                        if (ii2Var.A0()) {
                            View viewFindViewById7 = ii2Var.s0().findViewById(R.id.feedback_text_textinputlayout);
                            viewFindViewById7.getClass();
                            EditText editText5 = ((TextInputLayout) viewFindViewById7).getEditText();
                            if (!im3.n(editText5 != null ? Boolean.valueOf(ub7.x0(editText5.getText().toString()).toString().length() == 0) : null, Boolean.FALSE)) {
                                ii2Var.B0(R.string.tv_feedback_YourRatingHasBeenSubmittedSuccessfully);
                            } else {
                                n02 n02Var2 = new n02(ii2Var.r0());
                                String strI2 = ii2Var.I(R.string.tv_feedback_SendRatingOnlyQuestion);
                                strI2.getClass();
                                n02Var2.d = strI2;
                                String strI3 = ii2Var.I(R.string.tv_submit);
                                strI3.getClass();
                                hi2 hi2Var = new hi2(ii2Var, (byte) 1);
                                n02Var2.q = strI3;
                                n02Var2.r = hi2Var;
                                String strI4 = ii2Var.I(R.string.tv_cancel);
                                strI4.getClass();
                                vv vvVar = new vv((byte) 17);
                                n02Var2.n = strI4;
                                n02Var2.f1529o = vvVar;
                                String strI5 = ii2Var.I(R.string.tv_feedback_AreYouSureYouWantToProceed);
                                strI5.getClass();
                                n02Var2.e = strI5;
                                n02Var2.f = false;
                                od odVarA = n02Var2.a();
                                odVarA.setCancelable(false);
                                odVarA.show();
                            }
                        }
                        break;
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: o.ei2
            public final /* synthetic */ ii2 n;

            {
                this.n = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gi2 gi2Var;
                String str;
                byte b6 = b2;
                ii2 ii2Var = this.n;
                switch (b6) {
                    case 0:
                        view.getClass();
                        View viewFindViewById = ii2Var.s0().findViewById(R.id.idea_radiobutton);
                        viewFindViewById.getClass();
                        boolean zIsChecked = ((RadioButton) viewFindViewById).isChecked();
                        View viewFindViewById2 = ii2Var.s0().findViewById(R.id.problem_radiobutton);
                        viewFindViewById2.getClass();
                        boolean zIsChecked2 = ((RadioButton) viewFindViewById2).isChecked();
                        boolean z = ii2Var.q0;
                        gi2 gi2Var2 = gi2.n;
                        gi2 gi2Var3 = gi2.m;
                        if (z) {
                            gi2Var = gi2.f895o;
                        } else if (zIsChecked) {
                            gi2Var = gi2Var3;
                        } else if (zIsChecked2) {
                            gi2Var = gi2Var2;
                        }
                        if (ii2Var.A0()) {
                            view.setEnabled(false);
                        }
                        boolean z2 = ii2Var.p0;
                        IRatingViewModel iRatingViewModel = ii2Var.t0;
                        if (z2) {
                            if (iRatingViewModel == null) {
                                ye4.c("FeedbackAndRatingFragment", "Sending GA statistics failed. ViewModel is null.");
                            } else if (gi2Var == gi2Var3) {
                                iRatingViewModel.ReportActionEvent(IRatingViewModel.RatingActionEventType.FeedbackRated, "Idea");
                            } else if (gi2Var == gi2Var2) {
                                iRatingViewModel.ReportActionEvent(IRatingViewModel.RatingActionEventType.FeedbackRated, "Problem");
                            }
                        } else if (iRatingViewModel == null) {
                            ye4.c("FeedbackAndRatingFragment", "Sending GA statistics failed. ViewModel is null.");
                        } else if (gi2Var == gi2Var3) {
                            iRatingViewModel.ReportActionEvent(IRatingViewModel.RatingActionEventType.FeedbackSubmitted, "Idea");
                        } else {
                            iRatingViewModel.ReportActionEvent(IRatingViewModel.RatingActionEventType.FeedbackSubmitted, "Problem");
                        }
                        if (ii2Var.A0()) {
                            n02 n02Var = new n02(ii2Var.r0());
                            String strI = ii2Var.I(R.string.tv_feedback_ThankYou);
                            strI.getClass();
                            n02Var.d = strI;
                            IFeedbackViewModel iFeedbackViewModelGetFeedbackViewModel = ii2Var.s0;
                            if (iFeedbackViewModelGetFeedbackViewModel == null) {
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
                                iFeedbackViewModelGetFeedbackViewModel = FeedbackViewModelFactory.GetFeedbackViewModel(strConcat, str2.concat(" Android"));
                                ii2Var.s0 = iFeedbackViewModelGetFeedbackViewModel;
                            }
                            if (ii2Var.q0) {
                                iFeedbackViewModelGetFeedbackViewModel.getClass();
                                iFeedbackViewModelGetFeedbackViewModel.SetCategory("SecurityFeedback");
                            } else {
                                iFeedbackViewModelGetFeedbackViewModel.getClass();
                                View viewFindViewById3 = ii2Var.s0().findViewById(R.id.idea_radiobutton);
                                viewFindViewById3.getClass();
                                iFeedbackViewModelGetFeedbackViewModel.SetCategory(((RadioButton) viewFindViewById3).isChecked() ? "Idea" : "Problem");
                            }
                            IFeedbackViewModel iFeedbackViewModel = ii2Var.s0;
                            if (iFeedbackViewModel != null) {
                                View viewFindViewById4 = ii2Var.s0().findViewById(R.id.email_text_textinputlayout);
                                viewFindViewById4.getClass();
                                EditText editText3 = ((TextInputLayout) viewFindViewById4).getEditText();
                                iFeedbackViewModel.SetEmail(editText3 != null ? ub7.x0(editText3.getText().toString()).toString() : null);
                            }
                            IFeedbackViewModel iFeedbackViewModel2 = ii2Var.s0;
                            if (iFeedbackViewModel2 != null) {
                                View viewFindViewById5 = ii2Var.s0().findViewById(R.id.feedback_text_textinputlayout);
                                viewFindViewById5.getClass();
                                EditText editText4 = ((TextInputLayout) viewFindViewById5).getEditText();
                                iFeedbackViewModel2.SetComment(editText4 != null ? ub7.x0(editText4.getText().toString()).toString() : null);
                            }
                            IFeedbackViewModel iFeedbackViewModel3 = ii2Var.s0;
                            if (iFeedbackViewModel3 != null) {
                                iFeedbackViewModel3.SetRating(ii2Var.r0);
                            }
                            View viewFindViewById6 = ii2Var.s0().findViewById(R.id.attach_log_switch);
                            viewFindViewById6.getClass();
                            boolean zIsChecked3 = ((Switch) viewFindViewById6).isChecked();
                            IFeedbackViewModel iFeedbackViewModel4 = ii2Var.s0;
                            if (iFeedbackViewModel4 != null) {
                                iFeedbackViewModel4.SetLogFileAttached(zIsChecked3);
                            }
                            List list = lu.b;
                            Object absolutePath = zIsChecked3 ? xk0.w(ii2Var.r0()).getAbsolutePath() : null;
                            String str3 = absolutePath != null ? absolutePath : "";
                            IFeedbackViewModel iFeedbackViewModel5 = ii2Var.s0;
                            if (iFeedbackViewModel5 != null) {
                                iFeedbackViewModel5.UploadFeedback(str3, ii2Var.u0);
                            }
                        }
                        break;
                    default:
                        IRatingViewModel iRatingViewModel2 = ii2Var.t0;
                        if (iRatingViewModel2 == null) {
                            ye4.c("FeedbackAndRatingFragment", "Sending GA statistics failed. ViewModel is null.");
                        } else {
                            iRatingViewModel2.ReportActionEvent(IRatingViewModel.RatingActionEventType.SendOnlyRating, "");
                        }
                        if (ii2Var.A0()) {
                            View viewFindViewById7 = ii2Var.s0().findViewById(R.id.feedback_text_textinputlayout);
                            viewFindViewById7.getClass();
                            EditText editText5 = ((TextInputLayout) viewFindViewById7).getEditText();
                            if (!im3.n(editText5 != null ? Boolean.valueOf(ub7.x0(editText5.getText().toString()).toString().length() == 0) : null, Boolean.FALSE)) {
                                ii2Var.B0(R.string.tv_feedback_YourRatingHasBeenSubmittedSuccessfully);
                            } else {
                                n02 n02Var2 = new n02(ii2Var.r0());
                                String strI2 = ii2Var.I(R.string.tv_feedback_SendRatingOnlyQuestion);
                                strI2.getClass();
                                n02Var2.d = strI2;
                                String strI3 = ii2Var.I(R.string.tv_submit);
                                strI3.getClass();
                                hi2 hi2Var = new hi2(ii2Var, (byte) 1);
                                n02Var2.q = strI3;
                                n02Var2.r = hi2Var;
                                String strI4 = ii2Var.I(R.string.tv_cancel);
                                strI4.getClass();
                                vv vvVar = new vv((byte) 17);
                                n02Var2.n = strI4;
                                n02Var2.f1529o = vvVar;
                                String strI5 = ii2Var.I(R.string.tv_feedback_AreYouSureYouWantToProceed);
                                strI5.getClass();
                                n02Var2.e = strI5;
                                n02Var2.f = false;
                                od odVarA = n02Var2.a();
                                odVarA.setCancelable(false);
                                odVarA.show();
                            }
                        }
                        break;
                }
            }
        });
        viewInflate.findViewById(R.id.linearlayout).setOnTouchListener(new fi2());
        return viewInflate;
    }

    @Override // o.ut2
    public final void h0(Bundle bundle) {
        bundle.putInt("RatingId", this.r0);
        bundle.putBoolean("RatingControlsId", this.p0);
        bundle.putBoolean("ScamProtectionFeedback", this.q0);
    }
}
