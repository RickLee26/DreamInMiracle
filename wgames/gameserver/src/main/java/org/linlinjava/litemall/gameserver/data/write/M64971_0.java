package org.linlinjava.litemall.gameserver.data.write;

import org.linlinjava.litemall.gameserver.data.GameWriteTool;
import org.linlinjava.litemall.gameserver.netty.BaseWrite;
import org.springframework.stereotype.Service;
import io.netty.buffer.ByteBuf;
import org.linlinjava.litemall.gameserver.data.vo.Vo_64971_0;
@Service
public class M64971_0 extends BaseWrite {
    @Override
    protected void writeO(ByteBuf writeBuf,Object object) {
Vo_64971_0 object1 = (Vo_64971_0)object;
 GameWriteTool.writeShort(writeBuf,object1.count);

 GameWriteTool.writeInt(writeBuf,object1.id);

 GameWriteTool.writeByte(writeBuf,object1.haveCalled);
}@Override
    public int cmd() {
        return 64971;
    }
}




