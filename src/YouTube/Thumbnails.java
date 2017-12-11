package YouTube;

import YouTube.DefaultSize;
import YouTube.High;
import YouTube.Medium;

/**
 * Created by checho on 05/12/2017.
 */
public class Thumbnails {

    private DefaultSize default_size;
    private Medium medium;
    private High high;
    private String channelTitle;
    private String liveBroadcastContent;

    public DefaultSize getDefault_size() {
        return default_size;
    }

    public void setDefault_size(DefaultSize default_size) {
        this.default_size = default_size;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public High getHigh() {
        return high;
    }

    public void setHigh(High high) {
        this.high = high;
    }

    public String getChannelTitle() {
        return channelTitle;
    }

    public void setChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle;
    }

    public String getLiveBroadcastContent() {
        return liveBroadcastContent;
    }

    public void setLiveBroadcastContent(String liveBroadcastContent) {
        this.liveBroadcastContent = liveBroadcastContent;
    }
}
