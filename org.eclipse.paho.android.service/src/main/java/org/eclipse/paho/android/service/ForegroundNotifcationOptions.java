package org.eclipse.paho.android.service;

import android.os.Parcel;
import android.os.Parcelable;

public class ForegroundNotifcationOptions implements Parcelable {

    static final String PARCELABLE_NAME = "foregroundNotifcationOptions";

    private int smallIcon;
    private String contentTitle;
    private String contentText;

    public int getSmallIcon() {
        return smallIcon;
    }

    public void setSmallIcon(int smallIcon) {
        this.smallIcon = smallIcon;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
    }

    public String getContentText() {
        return contentText;
    }

    public ForegroundNotifcationOptions() {
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    protected ForegroundNotifcationOptions(Parcel in) {
        smallIcon = in.readInt();
        contentTitle = in.readString();
        contentText = in.readString();
    }

    public static final Creator<ForegroundNotifcationOptions> CREATOR = new Creator<ForegroundNotifcationOptions>() {
        @Override
        public ForegroundNotifcationOptions createFromParcel(Parcel in) {
            return new ForegroundNotifcationOptions(in);
        }

        @Override
        public ForegroundNotifcationOptions[] newArray(int size) {
            return new ForegroundNotifcationOptions[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(smallIcon);
        dest.writeString(contentTitle);
        dest.writeString(contentText);
    }
}
