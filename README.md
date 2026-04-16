# Soaryn Chest

A Minecraft mod that adds a chest which automatically absorbs your inventory when placed.

Built for **Minecraft 26.1** using **NeoForge 26.1.2**.

## Features

- **Auto-absorb inventory** — When you place a Soaryn Chest, your inventory items are transferred into it instantly.
- **Configurable hotbar inclusion** — Choose whether your hotbar slots are included in the transfer (default: off).
- **In-game config screen** — Accessible via the Mods menu.
- **Standard chest behavior** — Functions as a normal chest after placement (opening, double-chests, redstone, etc.).

## Crafting

Shapeless recipe:

🗃️ Chest + ⏬ Hopper = **Soaryn Chest**

## Configuration

| Option | Default | Description |
|---|---|---|
| `includeHotbar` | `false` | If `true`, hotbar items (slots 0–8) are also transferred into the chest on placement. |

Config file: `soarynchest-common.toml`

## Building

Requires **Java 25**.

```sh
./gradlew build
```

The built jar will be in `build/libs/`.

## License

[MIT](LICENSE)
