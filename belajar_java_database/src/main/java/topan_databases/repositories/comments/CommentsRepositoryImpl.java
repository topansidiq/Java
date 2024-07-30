package topan_databases.repositories.comments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import topan_databases.entities.Comments;
import topan_databases.utils.ConnectUtil;

public class CommentsRepositoryImpl implements CommentsRepository {

  @Override
  public void deleteAllComments() {
    try (Connection connection = ConnectUtil.getDataSource().getConnection()) {
      String sql = "DELETE FROM comments";
      Statement statement = connection.createStatement();
      statement.executeUpdate(sql);
    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }
  }

  @Override
  public void deleteComment(Integer id) {
    try (Connection connection = ConnectUtil.getDataSource().getConnection()) {
      String sql = "DELETE FROM comments WHERE id = ?";
      try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
      }
    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }
  }

  @Override
  public void deleteAllCommentOfEmail(String email) {
    try (Connection connection = ConnectUtil.getDataSource().getConnection()) {
      String sql = "DELETE FROM comments WHERE email = ?";
      try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setString(1, email);
        statement.executeUpdate();
      }
    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }
  }

  @Override
  public List<Comments> findAll() {
    try (Connection connection = ConnectUtil.getDataSource().getConnection()) {
      String sql = "SELECT * FROM comments";

      try (Statement statement = connection.createStatement()) {
        try (ResultSet resultSet = statement.executeQuery(sql)) {
          List<Comments> comments = new ArrayList<>();
          while (resultSet.next()) {
            comments.add(new Comments(
                resultSet.getInt("id"),
                resultSet.getString("email"),
                resultSet.getString("comment")));
          }
          return comments;
        }
      }
    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }
  }

  @Override
  public List<Comments> findAllByEmail(String email) {
    try (Connection connection = ConnectUtil.getDataSource().getConnection()) {
      String sql = "SELECT * FROM comments WHERE email = ?";
      try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        preparedStatement.setString(1, email);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
          List<Comments> comments = new ArrayList<>();
          while (resultSet.next()) {
            comments.add(new Comments(
                resultSet.getInt("id"),
                resultSet.getString("email"),
                resultSet.getString("comment")));
          }
          return comments;
        }
      }
    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }
  }

  @Override
  public Comments findId(Integer id) {
    try (Connection connection = ConnectUtil.getDataSource().getConnection()) {
      String sql = "SELECT * FROM comments WHERE id = ?";
      try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        preparedStatement.setInt(1, id);

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
          if (resultSet.next()) {
            return new Comments(resultSet.getInt("id"), resultSet.getString("email"), resultSet.getString("comment"));
          } else {
            return null;
          }
        }
      }
    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }
  }

  @Override
  public void insert(Comments comment) {
    try (Connection connection = ConnectUtil.getDataSource().getConnection()) {
      String sql = "INSERT INTO comments(email, comment) VALUES(?, ?)";
      try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
        statement.setString(1, comment.getEmail());
        statement.setString(2, comment.getComment());
        statement.executeUpdate();

        try (ResultSet resultSet = statement.getGeneratedKeys()) {
          if (resultSet.next()) {
            comment.setId(resultSet.getInt(1));
          }
        }
      }
    } catch (SQLException exception) {
      throw new RuntimeException(exception);
    }
  }

}
