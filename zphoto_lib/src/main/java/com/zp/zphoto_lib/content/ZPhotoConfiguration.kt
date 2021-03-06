package com.zp.zphoto_lib.content


/**
 * 配置信息
 */
class ZPhotoConfiguration {

    /**
     * 图片最多可选取数量
     */
    var maxPicSelect = ZPHOTO_DEFAULT_MAX_PIC_SELECT

    /**
     * 图片最大可选取大小
     */
    var maxPicSize = ZPHOTO_DEFAULT_MAX_PIC_SIZE

    /**
     * 图片最小可选取的大小
     */
    var minPicSize = ZPHOTO_DEFAULT_MIN_PIC_SIZE

    /**
     * 是否显示Gif
     */
    var showGif = false
    /**
     * 图片是否需要裁剪
     */
    var needCrop = false

    /**
     * 剪裁 自定义输出文件夹路径
     * 对于Android Q及以上版本：不是绝对路径和相对路径，只是文件夹名称  如：ZPhoto_crop
     * 其他版本应当为 ---> SD卡根目录/Photo/剪裁文件夹/ （结尾必须带/）
     */
    var cropFolderPath = ""

    /**
     * 图片是否需要压缩
     */
    var needCompress = false

    /**
     * 设置是否显示视频
     */
    var showVideo = false
    /**
     * 视频最多可选取数量
     */
    var maxVideoSelect = ZPHOTO_DEFAULT_MAX_VIDEO_SELECT
    /**
     * 设置视频最大可选取的size
     */
    var maxVideoSize = ZPHOTO_DEFAULT_MAX_VIDEO_SIZE
    /**
     * 设置视频最小可选取的size
     */
    var minVideoSize = ZPHOTO_DEFAULT_MIN_VIDEO_SIZE
    /**
     * 图片和视频是否可以同时选择
     */
    var allSelect = false
    /**
     * 相册页面是否显示拍照按钮
     */
    var showCamera = false

    /**
     * Android 7.0以上 需要的 FileProvider，一般都是包名 + xxxFileProvider
     */
    var authority = ""
    /**
     * 选中样式
     */
    var selectedBoxStyle = ZPHOTO_BOX_STYLE_DEFAULT

    var showLog = true


    /**
     * 方便java调用
     */
    class Builder {

        private var maxPicSelect = ZPHOTO_DEFAULT_MAX_PIC_SELECT
        private var maxPicSize = ZPHOTO_DEFAULT_MAX_PIC_SIZE
        private var minPicSize = ZPHOTO_DEFAULT_MIN_PIC_SIZE
        private var showGif = false
        private var needCrop = false
        private var cropFolderPath = ""

        private var needCompress = false

        private var showVideo = false
        private var maxVideoSelect = ZPHOTO_DEFAULT_MAX_VIDEO_SELECT
        private var maxVideoSize = ZPHOTO_DEFAULT_MAX_VIDEO_SIZE
        private var minVideoSize = ZPHOTO_DEFAULT_MIN_VIDEO_SIZE
        private var allSelect = false
        private var showCamera = false
        private var authority = ""
        private var selectedBoxStyle = ZPHOTO_BOX_STYLE_DEFAULT
        private var showLog = true

        fun maxPicSelect(maxPicSelect: Int): Builder {
            this.maxPicSelect = maxPicSelect
            return this
        }

        fun maxPicSize(maxPicSize: Int): Builder {
            this.maxPicSize = maxPicSize
            return this
        }

        fun minPicSize(minPicSize: Long): Builder {
            this.minPicSize = minPicSize
            return this
        }

        fun showGif(showGif: Boolean): Builder {
            this.showGif = showGif
            return this
        }

        fun needCrop(needCrop: Boolean): Builder {
            this.needCrop = needCrop
            return this
        }

        fun cropFolderPath(cropFolderPath: String): Builder {
            this.cropFolderPath = cropFolderPath
            return this
        }

        fun needCompress(needCompress: Boolean): Builder {
            this.needCompress = needCompress
            return this
        }

        fun showVideo(showVideo: Boolean): Builder {
            this.showVideo = showVideo
            return this
        }

        fun maxVideoSelect(maxVideoSelect: Int): Builder {
            this.maxVideoSelect = maxVideoSelect
            return this
        }

        fun maxVideoSize(maxVideoSize: Int): Builder {
            this.maxVideoSize = maxVideoSize
            return this
        }

        fun minVideoSize(minVideoSize: Long): Builder {
            this.minVideoSize = minVideoSize
            return this
        }

        fun allSelect(allSelect: Boolean): Builder {
            this.allSelect = allSelect
            return this
        }

        fun showCamera(showCamera: Boolean): Builder {
            this.showCamera = showCamera
            return this
        }

        fun authority(authority: String): Builder {
            this.authority = authority
            return this
        }

        fun selectedBoxStyle(selectedBoxStyle: Int): Builder {
            this.selectedBoxStyle = selectedBoxStyle
            return this
        }

        fun showLog(showLog: Boolean): Builder {
            this.showLog = showLog
            return this
        }

        fun builder() = ZPhotoConfiguration().apply {
            this.maxPicSelect = this@Builder.maxPicSelect
            this.maxPicSize = this@Builder.maxPicSize
            this.minPicSize = this@Builder.minPicSize
            this.showGif = this@Builder.showGif
            this.needCrop = this@Builder.needCrop
            this.cropFolderPath = this@Builder.cropFolderPath
            this.needCompress = this@Builder.needCompress
            this.showVideo = this@Builder.showVideo
            this.maxVideoSelect = this@Builder.maxVideoSelect
            this.maxVideoSize = this@Builder.maxVideoSize
            this.minVideoSize = this@Builder.minVideoSize
            this.allSelect = this@Builder.allSelect
            this.showCamera = this@Builder.showCamera
            this.authority = this@Builder.authority
            this.selectedBoxStyle = this@Builder.selectedBoxStyle
            this.showLog = this@Builder.showLog
        }
    }

}