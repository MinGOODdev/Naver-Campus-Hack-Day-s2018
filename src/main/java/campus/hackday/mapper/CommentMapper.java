package campus.hackday.mapper;

import campus.hackday.dto.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

  List<Comment> findAllByPostId(int postId);  // 해당 게시글 댓글 목록 조회
  Comment findById(int id);                   // 해당 댓글 조회

  // 공감 +, -
  void addPstReactCount(Comment comment);
  void subPstReactCount(Comment comment);

  // 비공감 +, -
  void addNgtReactCount(Comment comment);
  void subNgtReactCount(Comment comment);

}