package umc.hufs.newsapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import umc.hufs.newsapplication.databinding.FragmentNewsContentBinding

// 클래스 컨벤션
// 패키징을 한 번 해보기.
class FragmentNewsContent: Fragment() {
    private lateinit var viewBinding: FragmentNewsContentBinding
    //inner class를 써서 중첩시키는 것은 지양하기.

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentNewsContentBinding.inflate(inflater, container, false)
        return viewBinding.root



    }

    // listadapter는 notify메소드 사용할 필요를 없애준다.
    // ** DiffUtil : 알고리즘, 갱신에만 초점을 맞춰, 기존의 데이터와 비교하여 새로운 데이터를 업로드해줌.
    // listadapter의 구현
    // 리스트 사이즈도 오버로딩할 필요가 없다.
    // areItemsTheSame -> areContentsTheSame

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataList: ArrayList<NewsContentData> = arrayListOf()

        dataList.apply {
            add(NewsContentData("${R.id.firstArticleTitle}", R.drawable.first_article_pic,"${R.id.firstArticleJournalist}" ,"${R.id.firstArticleUpload}" ,"${R.id.firstArticlePhoto}"))
        }

        val newsContentRVAdapter = NewsContentRVAdapter(dataList)

        viewBinding.rvNewsDetail.adapter = newsContentRVAdapter
        viewBinding.rvNewsDetail.layoutManager = LinearLayoutManager(requireContext())
    }
}