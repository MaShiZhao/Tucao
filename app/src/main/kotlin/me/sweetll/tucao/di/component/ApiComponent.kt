package me.sweetll.tucao.di.component

import dagger.Subcomponent
import me.sweetll.tucao.base.BaseViewModel
import me.sweetll.tucao.business.channel.fragment.ChannelDetailFragment
import me.sweetll.tucao.business.rank.fragment.RankDetailFragment
import me.sweetll.tucao.business.video.fragment.VideoCommentsFragment
import me.sweetll.tucao.di.module.ApiModule
import me.sweetll.tucao.di.scope.ApplicationScope
import me.sweetll.tucao.extension.DownloadHelpers

@ApplicationScope
@Subcomponent(modules = arrayOf(ApiModule::class))
interface ApiComponent {
    fun inject(baseViewModel: BaseViewModel)
    fun inject(channelDetailFragment: ChannelDetailFragment)
    fun inject(rankDetailFragment: RankDetailFragment)
    fun inject(videoCommentsFragment: VideoCommentsFragment)
    fun inject(serviceInstance: DownloadHelpers.ServiceInstance)
}
