package com;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Commands implements CommandExecutor { // 명령어 처리 클래스는 CommandExcutor 인터페이스를 상속해야함.

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) { //명령어 실행시
        if (sender instanceof Player) { // 명령어가 사용자인 경우
            Player player = (Player) sender; // 명령어 사용자 객체를 플레이러 객체로 변환
            player.sendMessage("컬러의 테스트 명령어 실행"); // 사용자에게 메시지 발신

            ItemStack irons = new ItemStack(Material.IRON_INGOT); // 아이템을 ItemStack 객체를 생성해 만들 수 있음.
            ItemStack golds = new ItemStack(Material.GOLD_INGOT);
            ItemStack diamonds = new ItemStack(Material.DIAMOND);

            irons.setAmount(10); // 아이템 갯수를 정할 수 있음.
            golds.setAmount(20);
            diamonds.setAmount(30);

            player.getInventory().addItem(irons, golds, diamonds); // 플레이어의 인벤토리를 가져와 아이템을 집어넣음
            return true; // true 값을 반환하면 명령어 성공
        } else if (sender instanceof ConsoleCommandSender) { // 명령어 사용자가 콘솔인 경우 {
            sender.sendMessage("콘솔에서는 이 명령어를 사용할 수 없습니다.");
            return false;
        }
        return false;
    }
}