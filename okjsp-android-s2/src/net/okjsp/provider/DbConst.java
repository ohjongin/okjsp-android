package net.okjsp.provider;

import android.provider.BaseColumns;

public interface DbConst {
    public static final String DATABASE_NAME = "okjsp.db";
    public static final int DATABASE_VERSION = 1;
    
    public static final String TABLE_POST = "t_post";
    public static final String TABLE_BOARD = "t_board";
    
    /* COMMON FIELD */
    public static final String FIELD_CREATED_AT = "created_at";
    public static final String FIELD_UPDATED_AT = "updated_at";
    public static final String FIELD_BASECOLMUNS_ID = BaseColumns._ID;
    public static final String FIELD_SERIAL_NO = "serial_no";

    /* BOARD */
    public static final String FIELD_BOARD_NAME = "board_name";
    public static final String FIELD_BOARD_DISPLAY_NAME = "board_display_name";
    public static final String FIELD_BOARD_TIMESTAMP = "board_timestamp";
    public static final String FIELD_BOARD_CLICK_COUNT = "board_click_count";
    
    /* POST */
    public static final String FIELD_POST_ID = "post_id";
    public static final String FIELD_POST_URL = "post_url";
    public static final String FIELD_POST_WRITER_NAME = "writer_name";
    public static final String FIELD_POST_WRITER_PHOTO_URL = "writer_photo_url";
    public static final String FIELD_POST_READ_COUNT = "read_count";
    public static final String FIELD_POST_CONTENT = "content";
}