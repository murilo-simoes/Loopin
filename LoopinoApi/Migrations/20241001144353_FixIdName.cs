using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace LoopinApi.Migrations
{
    /// <inheritdoc />
    public partial class FixIdName : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.RenameColumn(
                name: "Guid",
                table: "Users",
                newName: "Id");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.RenameColumn(
                name: "Id",
                table: "Users",
                newName: "Guid");
        }
    }
}
