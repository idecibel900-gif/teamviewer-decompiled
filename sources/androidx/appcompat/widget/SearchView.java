package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.v0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o.am6;
import o.be8;
import o.bm6;
import o.cm6;
import o.dm6;
import o.dt0;
import o.dv0;
import o.e90;
import o.em6;
import o.ep3;
import o.fm6;
import o.gc0;
import o.gm6;
import o.hc0;
import o.jt;
import o.pe7;
import o.qf1;
import o.rs4;
import o.v94;
import o.yr;
import o.zz5;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends v94 implements dv0 {
    public static final rs4 u0;
    public final SearchAutoComplete B;
    public final View C;
    public final View D;
    public final View E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final View J;
    public gm6 K;
    public final Rect L;
    public final Rect M;
    public final int[] N;
    public final int[] O;
    public final ImageView P;
    public final Drawable Q;
    public final int R;
    public final int S;
    public final Intent T;
    public final Intent U;
    public final CharSequence V;
    public dm6 W;
    public View.OnFocusChangeListener a0;
    public View.OnClickListener b0;
    public boolean c0;
    public boolean d0;
    public qf1 e0;
    public boolean f0;
    public CharSequence g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public boolean k0;
    public String l0;
    public CharSequence m0;
    public boolean n0;
    public int o0;
    public SearchableInfo p0;
    public Bundle q0;
    public final am6 r0;
    public final am6 s0;
    public final WeakHashMap t0;

    static {
        rs4 rs4Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            rs4 rs4Var2 = new rs4();
            rs4Var2.a = null;
            rs4Var2.b = null;
            rs4Var2.c = null;
            rs4.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                rs4Var2.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                rs4Var2.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                rs4Var2.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            rs4Var = rs4Var2;
        }
        u0 = rs4Var;
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.L = new Rect();
        this.M = new Rect();
        this.N = new int[2];
        this.O = new int[2];
        this.r0 = new am6(this, (byte) 0);
        this.s0 = new am6(this, (byte) 1);
        this.t0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        bm6 bm6Var = new bm6(this);
        jt jtVar = new jt(this, (byte) 2);
        gc0 gc0Var = new gc0(this, (byte) 3);
        hc0 hc0Var = new hc0(this, (byte) 7);
        int[] iArr = zz5.u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ep3 ep3Var = new ep3(context, typedArrayObtainStyledAttributes);
        be8.l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.B = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.C = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.D = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.E = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.F = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.G = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.H = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.I = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.P = imageView5;
        viewFindViewById.setBackground(ep3Var.l(10));
        viewFindViewById2.setBackground(ep3Var.l(14));
        imageView.setImageDrawable(ep3Var.l(13));
        imageView2.setImageDrawable(ep3Var.l(7));
        imageView3.setImageDrawable(ep3Var.l(4));
        imageView4.setImageDrawable(ep3Var.l(16));
        imageView5.setImageDrawable(ep3Var.l(13));
        this.Q = ep3Var.l(12);
        imageView.setTooltipText(getResources().getString(R.string.abc_searchview_description_search));
        this.R = typedArrayObtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.S = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(hc0Var);
        searchAutoComplete.setOnEditorActionListener(bm6Var);
        searchAutoComplete.setOnItemClickListener(jtVar);
        searchAutoComplete.setOnItemSelectedListener(gc0Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new dt0(this, (byte) 2));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.V = typedArrayObtainStyledAttributes.getText(6);
        this.g0 = typedArrayObtainStyledAttributes.getText(11);
        int i2 = typedArrayObtainStyledAttributes.getInt(3, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(0, true));
        ep3Var.B();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.T = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.U = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.J = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e90(this, (byte) 2));
        }
        x(this.c0);
        u();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.B;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.i0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.B;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.i0 = false;
    }

    public int getImeOptions() {
        return this.B.getImeOptions();
    }

    public int getInputType() {
        return this.B.getInputType();
    }

    public int getMaxWidth() {
        return this.j0;
    }

    public CharSequence getQuery() {
        return this.B.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.g0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.p0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.V : getContext().getText(this.p0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.S;
    }

    public int getSuggestionRowLayout() {
        return this.R;
    }

    public qf1 getSuggestionsAdapter() {
        return this.e0;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.m0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.q0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.p0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.q0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.B;
        if (i >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        rs4 rs4Var = u0;
        rs4Var.getClass();
        rs4.a();
        Method method = rs4Var.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        rs4.a();
        Method method2 = rs4Var.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.B;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.c0) {
            clearFocus();
            x(true);
        }
    }

    public final void n(int i) {
        int position;
        String strG;
        Cursor cursor = this.e0.f1827o;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentJ = null;
            try {
                int i2 = pe7.J;
                String strG2 = pe7.g(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strG2 == null) {
                    strG2 = this.p0.getSuggestIntentAction();
                }
                if (strG2 == null) {
                    strG2 = "android.intent.action.SEARCH";
                }
                String strG3 = pe7.g(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strG3 == null) {
                    strG3 = this.p0.getSuggestIntentData();
                }
                if (strG3 != null && (strG = pe7.g(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strG3 = strG3 + "/" + Uri.encode(strG);
                }
                intentJ = j(strG2, strG3 == null ? null : Uri.parse(strG3), pe7.g(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), pe7.g(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                v0.l("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e);
            }
            if (intentJ != null) {
                try {
                    getContext().startActivity(intentJ);
                } catch (RuntimeException e2) {
                    v0.d("SearchView", "Failed launch activity: " + intentJ, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.B;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i) {
        Editable text = this.B.getText();
        Cursor cursor = this.e0.f1827o;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strC = this.e0.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    @Override // o.dv0
    public final void onActionViewCollapsed() {
        r("", false);
        clearFocus();
        x(true);
        this.B.setImeOptions(this.o0);
        this.n0 = false;
    }

    @Override // o.dv0
    public final void onActionViewExpanded() {
        if (this.n0) {
            return;
        }
        this.n0 = true;
        SearchAutoComplete searchAutoComplete = this.B;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.o0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.r0);
        post(this.s0);
        super.onDetachedFromWindow();
    }

    @Override // o.v94, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.B;
            int[] iArr = this.N;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.O;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.L;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.M;
            rect2.set(i7, 0, i8, i9);
            gm6 gm6Var = this.K;
            if (gm6Var == null) {
                gm6 gm6Var2 = new gm6(rect2, rect, searchAutoComplete);
                this.K = gm6Var2;
                setTouchDelegate(gm6Var2);
            } else {
                gm6Var.b.set(rect2);
                Rect rect3 = gm6Var.d;
                rect3.set(rect2);
                int i10 = -gm6Var.e;
                rect3.inset(i10, i10);
                gm6Var.c.set(rect);
            }
        }
    }

    @Override // o.v94, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.d0) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.j0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.j0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.j0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fm6)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fm6 fm6Var = (fm6) parcelable;
        super.onRestoreInstanceState(fm6Var.m);
        x(fm6Var.f812o);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        fm6 fm6Var = new fm6(super.onSaveInstanceState());
        fm6Var.f812o = this.d0;
        return fm6Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.r0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.B;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        dm6 dm6Var = this.W;
        if (dm6Var == null || !dm6Var.i(text.toString())) {
            if (this.p0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void r(CharSequence charSequence, boolean z) {
        SearchAutoComplete searchAutoComplete = this.B;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.m0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.i0 || !isFocusable()) {
            return false;
        }
        if (this.d0) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.B.requestFocus(i, rect);
        if (zRequestFocus) {
            x(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        boolean zIsEmpty = TextUtils.isEmpty(this.B.getText());
        int i = (!zIsEmpty || (this.c0 && !this.n0)) ? 0 : 8;
        ImageView imageView = this.H;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.q0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m();
            return;
        }
        x(false);
        SearchAutoComplete searchAutoComplete = this.B;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.b0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.c0 == z) {
            return;
        }
        this.c0 = z;
        x(z);
        u();
    }

    public void setImeOptions(int i) {
        this.B.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.B.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.j0 = i;
        requestLayout();
    }

    public void setOnCloseListener(cm6 cm6Var) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.a0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(dm6 dm6Var) {
        this.W = dm6Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.b0 = onClickListener;
    }

    public void setOnSuggestionListener(em6 em6Var) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.g0 = charSequence;
        u();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.h0 = z;
        qf1 qf1Var = this.e0;
        if (qf1Var instanceof pe7) {
            ((pe7) qf1Var).B = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z;
        this.p0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.B;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.p0.getImeOptions());
            int inputType = this.p0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.p0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            qf1 qf1Var = this.e0;
            if (qf1Var != null) {
                qf1Var.b(null);
            }
            if (this.p0.getSuggestAuthority() != null) {
                pe7 pe7Var = new pe7(getContext(), this, this.p0, this.t0);
                this.e0 = pe7Var;
                searchAutoComplete.setAdapter(pe7Var);
                ((pe7) this.e0).B = this.h0 ? 2 : 1;
            }
            u();
        }
        SearchableInfo searchableInfo2 = this.p0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.p0.getVoiceSearchLaunchWebSearch()) {
                intent = this.T;
            } else if (this.p0.getVoiceSearchLaunchRecognizer()) {
                intent = this.U;
            }
            z = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.k0 = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        x(this.d0);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f0 = z;
        x(this.d0);
    }

    public void setSuggestionsAdapter(qf1 qf1Var) {
        this.e0 = qf1Var;
        this.B.setAdapter(qf1Var);
    }

    public final void t() {
        int[] iArr = this.B.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.D.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.E.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

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
    public final void u() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z = this.c0;
        SearchAutoComplete searchAutoComplete = this.B;
        CharSequence charSequence2 = charSequence;
        if (z && (drawable = this.Q) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void v() {
        this.E.setVisibility(((this.f0 || this.k0) && !this.d0 && (this.G.getVisibility() == 0 || this.I.getVisibility() == 0)) ? 0 : 8);
    }

    public final void w(boolean z) {
        boolean z2 = this.f0;
        this.G.setVisibility((!z2 || !(z2 || this.k0) || this.d0 || !hasFocus() || (!z && this.k0)) ? 8 : 0);
    }

    public final void x(boolean z) {
        this.d0 = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.B.getText());
        this.F.setVisibility(i2);
        w(!zIsEmpty);
        this.C.setVisibility(z ? 8 : 0);
        ImageView imageView = this.P;
        imageView.setVisibility((imageView.getDrawable() == null || this.c0) ? 8 : 0);
        s();
        if (this.k0 && !this.d0 && zIsEmpty) {
            this.G.setVisibility(8);
            i = 0;
        }
        this.I.setVisibility(i);
        v();
    }

    public static class SearchAutoComplete extends yr {
        public int q;
        public SearchView r;
        public boolean s;
        public final d t;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.t = new d(this);
            this.q = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            rs4 rs4Var = SearchView.u0;
            rs4Var.getClass();
            rs4.a();
            Method method = rs4Var.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.q <= 0 || super.enoughToFilter();
        }

        @Override // o.yr, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.s) {
                d dVar = this.t;
                removeCallbacks(dVar);
                post(dVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.r;
            searchView.x(searchView.d0);
            searchView.post(searchView.r0);
            if (searchView.B.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.r.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.r.hasFocus() && getVisibility() == 0) {
                this.s = true;
                Context context = getContext();
                rs4 rs4Var = SearchView.u0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.t;
            if (!z) {
                this.s = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.s = true;
                    return;
                }
                this.s = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.r = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.q = i;
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context) {
        this(context, null);
    }
}
