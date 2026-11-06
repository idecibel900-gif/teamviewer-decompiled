package o;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pe7 extends qf1 implements View.OnClickListener {
    public static final /* synthetic */ int J = 0;
    public final int A;
    public int B;
    public ColorStateList C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int t;
    public final int u;
    public final LayoutInflater v;
    public final SearchView w;
    public final SearchableInfo x;
    public final Context y;
    public final WeakHashMap z;

    public pe7(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.n = true;
        this.f1827o = null;
        this.m = false;
        this.p = -1;
        this.q = new uy(this);
        this.r = new pf1(this, (byte) 0);
        this.u = suggestionRowLayout;
        this.t = suggestionRowLayout;
        this.v = (LayoutInflater) context.getSystemService("layout_inflater");
        this.B = 1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.w = searchView;
        this.x = searchableInfo;
        this.A = searchView.getSuggestionCommitIconResId();
        this.y = context;
        this.z = weakHashMap;
    }

    public static String g(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            io.sentry.android.core.v0.d("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    @Override // o.qf1
    public final void a(View view, Cursor cursor) {
        int i;
        Drawable drawableE;
        CharSequence charSequenceG;
        oe7 oe7Var = (oe7) view.getTag();
        int i2 = this.I;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        TextView textView = oe7Var.a;
        TextView textView2 = oe7Var.b;
        ImageView imageView = oe7Var.e;
        if (textView != null) {
            String strG = g(cursor, this.D);
            textView.setText(strG);
            if (TextUtils.isEmpty(strG)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.y;
        if (textView2 != null) {
            String strG2 = g(cursor, this.F);
            if (strG2 != null) {
                if (this.C == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.C = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strG2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.C, null), 0, strG2.length(), 33);
                charSequenceG = spannableString;
            } else {
                charSequenceG = g(cursor, this.E);
            }
            if (TextUtils.isEmpty(charSequenceG)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceG);
            if (TextUtils.isEmpty(charSequenceG)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = oe7Var.c;
        if (imageView2 != null) {
            int i4 = this.G;
            if (i4 == -1) {
                drawableE = null;
            } else {
                drawableE = e(cursor.getString(i4));
                if (drawableE == null) {
                    ComponentName searchActivity = this.x.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.z;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
                        drawableE = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    StringBuilder sbK = fx3.k(iconResource, "Invalid icon resource ", " for ");
                                    sbK.append(searchActivity.flattenToShortString());
                                    io.sentry.android.core.v0.j("SuggestionsAdapter", sbK.toString());
                                    drawableE = null;
                                } else {
                                    drawableE = drawable;
                                }
                            } else {
                                drawableE = null;
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            io.sentry.android.core.v0.j("SuggestionsAdapter", e.toString());
                        }
                        weakHashMap.put(strFlattenToShortString, drawableE == null ? null : drawableE.getConstantState());
                    }
                    if (drawableE == null) {
                        drawableE = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(drawableE);
            if (drawableE == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                drawableE.setVisible(false, false);
                drawableE.setVisible(true, false);
            }
        }
        ImageView imageView3 = oe7Var.d;
        if (imageView3 == null) {
            i = 1;
        } else {
            int i5 = this.H;
            Drawable drawableE2 = i5 == -1 ? null : e(cursor.getString(i5));
            imageView3.setImageDrawable(drawableE2);
            if (drawableE2 == null) {
                imageView3.setVisibility(8);
                i = 1;
            } else {
                imageView3.setVisibility(0);
                drawableE2.setVisible(false, false);
                i = 1;
                drawableE2.setVisible(true, false);
            }
        }
        int i6 = this.B;
        if (i6 != 2 && (i6 != i || (i3 & 1) == 0)) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // o.qf1
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.D = cursor.getColumnIndex("suggest_text_1");
                this.E = cursor.getColumnIndex("suggest_text_2");
                this.F = cursor.getColumnIndex("suggest_text_2_url");
                this.G = cursor.getColumnIndex("suggest_icon_1");
                this.H = cursor.getColumnIndex("suggest_icon_2");
                this.I = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            io.sentry.android.core.v0.d("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // o.qf1
    public final String c(Cursor cursor) {
        String strG;
        String strG2;
        if (cursor == null) {
            return null;
        }
        String strG3 = g(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strG3 != null) {
            return strG3;
        }
        SearchableInfo searchableInfo = this.x;
        if (searchableInfo.shouldRewriteQueryFromData() && (strG2 = g(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strG2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strG = g(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strG;
    }

    public final Drawable d(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            hk0.k(uri, "No authority: ");
            return null;
        }
        try {
            Resources resourcesForApplication = this.y.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                hk0.k(uri, "No path: ");
                return null;
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    hk0.k(uri, "Single path segment is not a resource ID: ");
                    return null;
                }
            } else {
                if (size != 2) {
                    hk0.k(uri, "More than two path segments: ");
                    return null;
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            hk0.k(uri, "No resource found for: ");
            return null;
        } catch (PackageManager.NameNotFoundException unused2) {
            hk0.k(uri, "No package found for authority: ");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    public final Drawable e(String str) {
        WeakHashMap weakHashMap = this.z;
        Context context = this.y;
        Drawable drawableD = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawable = context.getDrawable(i);
                if (drawable != null) {
                    weakHashMap.put(str2, drawable.getConstantState());
                }
                return drawable;
            } catch (Resources.NotFoundException unused) {
                io.sentry.android.core.v0.j("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableD = d(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e) {
                                io.sentry.android.core.v0.d("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                            }
                            drawableD = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e2) {
                                io.sentry.android.core.v0.d("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e3) {
                    io.sentry.android.core.v0.j("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
                    if (drawableD != null) {
                        weakHashMap.put(str, drawableD.getConstantState());
                    }
                    return drawableD;
                }
                if (drawableD != null) {
                    weakHashMap.put(str, drawableD.getConstantState());
                }
            }
        }
        return drawableD;
    }

    public final Cursor f(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.y.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // o.qf1, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            io.sentry.android.core.v0.l("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewInflate = this.v.inflate(this.u, viewGroup, false);
            if (viewInflate != null) {
                ((oe7) viewInflate.getTag()).a.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // o.qf1, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            io.sentry.android.core.v0.l("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewInflate = this.v.inflate(this.t, viewGroup, false);
            viewInflate.setTag(new oe7(viewInflate));
            ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.A);
            ((oe7) viewInflate.getTag()).a.setText(e.toString());
            return viewInflate;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f1827o;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f1827o;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.w.p((CharSequence) tag);
        }
    }
}
