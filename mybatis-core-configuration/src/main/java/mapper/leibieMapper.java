package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.leibie;

import java.util.List;
import java.util.Map;

public interface leibieMapper {
    List<leibie> selectall();

    leibie selectid(@Param("id")int id,@Param("名称")String 名称);

    List<leibie> selectAllByIdLeibie(leibie leibie);
    leibie selectAllByIdMap(Map map);

    void add(leibie leibie);
}
