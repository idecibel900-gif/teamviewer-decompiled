package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.widget.NestedScrollView;
import com.teamviewer.chatviewlib.view.RoundAccountPictureImageView;
import com.teamviewer.remotecontrolviewlib.layout.ExpandablePanel;
import com.teamviewer.remotecontrolviewlib.view.partnerlist.DeviceOptionsActionButton;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class du2 {
    public final NestedScrollView a;
    public final LinearLayout b;
    public final RoundAccountPictureImageView c;
    public final DeviceOptionsActionButton d;
    public final AppCompatImageView e;
    public final DeviceOptionsActionButton f;
    public final TextView g;
    public final DeviceOptionsActionButton h;
    public final TextView i;
    public final DeviceOptionsActionButton j;
    public final DeviceOptionsActionButton k;
    public final ExpandablePanel l;
    public final TextView m;
    public final TextView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final DeviceOptionsActionButton f655o;
    public final TextView p;
    public final LinearLayout q;
    public final DeviceOptionsActionButton r;
    public final DeviceOptionsActionButton s;

    public du2(NestedScrollView nestedScrollView, LinearLayout linearLayout, RoundAccountPictureImageView roundAccountPictureImageView, DeviceOptionsActionButton deviceOptionsActionButton, AppCompatImageView appCompatImageView, DeviceOptionsActionButton deviceOptionsActionButton2, TextView textView, DeviceOptionsActionButton deviceOptionsActionButton3, TextView textView2, DeviceOptionsActionButton deviceOptionsActionButton4, DeviceOptionsActionButton deviceOptionsActionButton5, ExpandablePanel expandablePanel, TextView textView3, TextView textView4, DeviceOptionsActionButton deviceOptionsActionButton6, TextView textView5, LinearLayout linearLayout2, DeviceOptionsActionButton deviceOptionsActionButton7, DeviceOptionsActionButton deviceOptionsActionButton8) {
        this.a = nestedScrollView;
        this.b = linearLayout;
        this.c = roundAccountPictureImageView;
        this.d = deviceOptionsActionButton;
        this.e = appCompatImageView;
        this.f = deviceOptionsActionButton2;
        this.g = textView;
        this.h = deviceOptionsActionButton3;
        this.i = textView2;
        this.j = deviceOptionsActionButton4;
        this.k = deviceOptionsActionButton5;
        this.l = expandablePanel;
        this.m = textView3;
        this.n = textView4;
        this.f655o = deviceOptionsActionButton6;
        this.p = textView5;
        this.q = linearLayout2;
        this.r = deviceOptionsActionButton7;
        this.s = deviceOptionsActionButton8;
    }

    public static du2 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device_options, viewGroup, false);
        int i = R.id.actions_wrapper;
        LinearLayout linearLayout = (LinearLayout) r47.s(viewInflate, R.id.actions_wrapper);
        if (linearLayout != null) {
            i = R.id.avatar_image_container;
            RoundAccountPictureImageView roundAccountPictureImageView = (RoundAccountPictureImageView) r47.s(viewInflate, R.id.avatar_image_container);
            if (roundAccountPictureImageView != null) {
                i = R.id.chat_button;
                DeviceOptionsActionButton deviceOptionsActionButton = (DeviceOptionsActionButton) r47.s(viewInflate, R.id.chat_button);
                if (deviceOptionsActionButton != null) {
                    i = R.id.computer_status;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) r47.s(viewInflate, R.id.computer_status);
                    if (appCompatImageView != null) {
                        i = R.id.connect_with_password_button;
                        DeviceOptionsActionButton deviceOptionsActionButton2 = (DeviceOptionsActionButton) r47.s(viewInflate, R.id.connect_with_password_button);
                        if (deviceOptionsActionButton2 != null) {
                            i = R.id.connect_with_password_tooltip;
                            TextView textView = (TextView) r47.s(viewInflate, R.id.connect_with_password_tooltip);
                            if (textView != null) {
                                i = R.id.connect_with_prompt_button;
                                DeviceOptionsActionButton deviceOptionsActionButton3 = (DeviceOptionsActionButton) r47.s(viewInflate, R.id.connect_with_prompt_button);
                                if (deviceOptionsActionButton3 != null) {
                                    i = R.id.connect_with_prompt_tooltip;
                                    TextView textView2 = (TextView) r47.s(viewInflate, R.id.connect_with_prompt_tooltip);
                                    if (textView2 != null) {
                                        i = R.id.connect_with_remote_access;
                                        DeviceOptionsActionButton deviceOptionsActionButton4 = (DeviceOptionsActionButton) r47.s(viewInflate, R.id.connect_with_remote_access);
                                        if (deviceOptionsActionButton4 != null) {
                                            i = R.id.details_button;
                                            DeviceOptionsActionButton deviceOptionsActionButton5 = (DeviceOptionsActionButton) r47.s(viewInflate, R.id.details_button);
                                            if (deviceOptionsActionButton5 != null) {
                                                i = R.id.device_description;
                                                ExpandablePanel expandablePanel = (ExpandablePanel) r47.s(viewInflate, R.id.device_description);
                                                if (expandablePanel != null) {
                                                    i = R.id.device_id;
                                                    TextView textView3 = (TextView) r47.s(viewInflate, R.id.device_id);
                                                    if (textView3 != null) {
                                                        i = R.id.deviceInfoBarrier;
                                                        if (((Barrier) r47.s(viewInflate, R.id.deviceInfoBarrier)) != null) {
                                                            i = R.id.device_name;
                                                            TextView textView4 = (TextView) r47.s(viewInflate, R.id.device_name);
                                                            if (textView4 != null) {
                                                                i = R.id.file_transfer_button;
                                                                DeviceOptionsActionButton deviceOptionsActionButton6 = (DeviceOptionsActionButton) r47.s(viewInflate, R.id.file_transfer_button);
                                                                if (deviceOptionsActionButton6 != null) {
                                                                    i = R.id.group_name;
                                                                    TextView textView5 = (TextView) r47.s(viewInflate, R.id.group_name);
                                                                    if (textView5 != null) {
                                                                        i = R.id.groupNameBarrier;
                                                                        if (((Barrier) r47.s(viewInflate, R.id.groupNameBarrier)) != null) {
                                                                            i = R.id.group_name_container;
                                                                            if (((LinearLayout) r47.s(viewInflate, R.id.group_name_container)) != null) {
                                                                                i = R.id.id_container;
                                                                                LinearLayout linearLayout2 = (LinearLayout) r47.s(viewInflate, R.id.id_container);
                                                                                if (linearLayout2 != null) {
                                                                                    i = R.id.shortcut_button;
                                                                                    DeviceOptionsActionButton deviceOptionsActionButton7 = (DeviceOptionsActionButton) r47.s(viewInflate, R.id.shortcut_button);
                                                                                    if (deviceOptionsActionButton7 != null) {
                                                                                        i = R.id.wake_up_button;
                                                                                        DeviceOptionsActionButton deviceOptionsActionButton8 = (DeviceOptionsActionButton) r47.s(viewInflate, R.id.wake_up_button);
                                                                                        if (deviceOptionsActionButton8 != null) {
                                                                                            return new du2((NestedScrollView) viewInflate, linearLayout, roundAccountPictureImageView, deviceOptionsActionButton, appCompatImageView, deviceOptionsActionButton2, textView, deviceOptionsActionButton3, textView2, deviceOptionsActionButton4, deviceOptionsActionButton5, expandablePanel, textView3, textView4, deviceOptionsActionButton6, textView5, linearLayout2, deviceOptionsActionButton7, deviceOptionsActionButton8);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
