package com.crzsc.plugin.utils

object Constants {
    /**
     * 配置map的key
     */
    const val KEY_CONFIGURATION_MAP = "flutter_assets_gen"
    /**
     * 输出目录的key
     */
    const val KEY_OUTPUT_DIR = "output_path"

    /**
     * 输出文件的类名
     */
    const val KEY_CLASS_NAME = "classname"

    /**
     * 是否自动检测
     */
    const val KEY_AUTO_DETECTION = "auto_detection"

    /**
     * 命名是否根据上级目录决定
     */
    const val KEY_NAMED_WITH_PARENT = "named_with_parent"

    const val KEY_LEADING_WITH_PACKAGE_NAME = "leading_with_package_name"

    /**
     * 输出的文件名
     */
    const val KEY_OUTPUT_FILENAME = "filename"

    /**
     * 分割文件的正则
     */
    const val FILENAME_SPLIT_PATTERN = "filename_split_pattern"

    /**
     * 忽略的目录
     */
    const val KEY_PATH_IGNORE = "exclude"

    /**
     * 需要自动生成资源的目录，如果没有则使用默认的Flutter assets配置目录
     */
    const val KEY_ASSETS_PATH = "assets_path"

    /**
     * 是否忽略注释
     */
    const val KEY_IGNORE_COMMENTS = "ignore_comments"

    /**
     * 默认目录
     */
    const val DEFAULT_OUTPUT_DIR = "generated"
    const val DEFAULT_CLASS_NAME = "Assets"

    const val DEFAULT_FILENAME_SPLIT_PATTERN = "[-_]"
}